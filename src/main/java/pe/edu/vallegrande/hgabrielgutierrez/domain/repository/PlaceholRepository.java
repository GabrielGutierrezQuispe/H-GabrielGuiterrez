package pe.edu.vallegrande.hgabrielgutierrez.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import pe.edu.vallegrande.hgabrielgutierrez.domain.model.Placehol;

public interface PlaceholRepository extends ReactiveMongoRepository<Placehol, String>{
}
