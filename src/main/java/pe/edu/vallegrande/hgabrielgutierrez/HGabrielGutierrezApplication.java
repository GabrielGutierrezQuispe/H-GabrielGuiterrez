package pe.edu.vallegrande.hgabrielgutierrez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactivefeign.spring.config.EnableReactiveFeignClients;

@SpringBootApplication
@EnableReactiveFeignClients(basePackages = "pe.edu.vallegrande.hgabrielgutierrez.application.feignclient")
public class HGabrielGutierrezApplication {

    public static void main(String[] args) {
        SpringApplication.run(HGabrielGutierrezApplication.class, args);
    }

}
