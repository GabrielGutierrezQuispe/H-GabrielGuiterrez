package pe.edu.vallegrande.hgabrielgutierrez.application.service;

import pe.edu.vallegrande.hgabrielgutierrez.domain.dto.Placeholder;
import pe.edu.vallegrande.hgabrielgutierrez.domain.model.Placehol;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaceholService {

    Flux<Placeholder> getAll();

    Mono<Placeholder> create(Placeholder placeholder);

    Flux<Placehol> getAlls();

}
