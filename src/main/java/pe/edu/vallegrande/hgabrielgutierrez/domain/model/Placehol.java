package pe.edu.vallegrande.hgabrielgutierrez.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "placeholApi")
public class Placehol {

    @Id
    private String id;
    private Long userId;
    private String title;
    private String body;

}
