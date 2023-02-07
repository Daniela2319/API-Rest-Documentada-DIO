package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Responsável por designar o bean de compoment que suporta requisições HTTP arquitetura Rest
public class WelcomeController {

    @GetMapping // mapeando nossos método. Especifica a rota raiz da API.
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
}
