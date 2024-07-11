package pe.edu.vallegrande.hgabrielgutierrez.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.vallegrande.hgabrielgutierrez.application.service.impl.PlaceholServiceImpl;
import pe.edu.vallegrande.hgabrielgutierrez.domain.dto.Placeholder;
import pe.edu.vallegrande.hgabrielgutierrez.domain.model.Placehol;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/placehol")
public class PlaceholController {

    private final PlaceholServiceImpl placeholServiceImpl;

    @Autowired
    public PlaceholController(PlaceholServiceImpl placeholServiceImpl){
        this.placeholServiceImpl = placeholServiceImpl;
    }

    @GetMapping("/API")
    public Flux<Placeholder> getAll(){
        return placeholServiceImpl.getAll();
    }

    @PostMapping
    public Mono<Placeholder> create(@RequestBody Placeholder placeholder){
        return placeholServiceImpl.create(placeholder);
    }

    @GetMapping
    public Flux<Placehol> getAlls(){
        return placeholServiceImpl.getAlls();
    }

}
