package pe.edu.vallegrande.hgabrielgutierrez.application.feignclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import pe.edu.vallegrande.hgabrielgutierrez.domain.dto.Placeholder;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(name = "Placeholder", url = "${external.api.url}")
public interface PlaceholderClient {

    @GetMapping("/posts")
    Flux<Placeholder> getExternalData();

    @PostMapping("/posts")
    Mono<Placeholder> create(Placeholder placeholder);

    @PutMapping("/posts/{id}")
    Mono<Placeholder> update();


}
