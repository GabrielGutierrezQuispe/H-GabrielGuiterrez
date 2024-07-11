package pe.edu.vallegrande.hgabrielgutierrez.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.vallegrande.hgabrielgutierrez.application.feignclient.PlaceholderClient;
import pe.edu.vallegrande.hgabrielgutierrez.application.service.PlaceholService;
import pe.edu.vallegrande.hgabrielgutierrez.domain.dto.Placeholder;
import pe.edu.vallegrande.hgabrielgutierrez.domain.model.Placehol;
import pe.edu.vallegrande.hgabrielgutierrez.domain.repository.PlaceholRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PlaceholServiceImpl implements PlaceholService {

    private final PlaceholderClient placeholderClient;
    private final PlaceholRepository placeholRepository;

    @Autowired
    public PlaceholServiceImpl(PlaceholderClient placeholderClient, PlaceholRepository placeholRepository){
        this.placeholderClient = placeholderClient;
        this.placeholRepository = placeholRepository;
    }

    @Override 
    public Flux<Placeholder> getAll() {
        return placeholderClient.getExternalData();
    }

    

    @Override
    public Mono<Placeholder> create(Placeholder placeholder) {
         Placehol placehol = new Placehol();
        placehol.setUserId(placeholder.getUserId());
        placehol.setTitle(placeholder.getTitle());
        placehol.setBody(placeholder.getBody());
        return placeholRepository.save(placehol)
                .thenReturn(placeholder);
    }

    @Override
    public Flux<Placehol> getAlls() {
        return placeholRepository.findAll();
    }


}
