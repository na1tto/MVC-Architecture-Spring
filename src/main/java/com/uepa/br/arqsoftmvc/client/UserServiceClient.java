package com.uepa.br.arqsoftmvc.client;

import com.uepa.br.arqsoftmvc.client.dto.UserLanguageResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
        }
        return new UserLanguageResponse("en");
    }
}
