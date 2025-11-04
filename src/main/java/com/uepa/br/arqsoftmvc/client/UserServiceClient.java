package com.uepa.br.arqsoftmvc.client;

import com.uepa.br.arqsoftmvc.client.dto.UserLanguageResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//Classe responsável por descobrir o idioma de um usuário.
//Aqui é feita uma simulação de um serviço externo consultando o
//serviço de saudaçoes
@Component
public class UserServiceClient {
    private final RestTemplate restTemplate;

    public UserServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserLanguageResponse getUserLanguage(long userId){
        System.out.println("Simulando SOA: buscando o idioma pelo ID do usuário: " + userId);
        if (userId == 1) {
            return new UserLanguageResponse("en");
        } else if (userId == 2) {
            return new UserLanguageResponse("es");
        } else if (userId == 3) {
            return new UserLanguageResponse("pt");
        } else if (userId == 4) {
            return new UserLanguageResponse("fr");
        }
        return new UserLanguageResponse("en");
    }
}