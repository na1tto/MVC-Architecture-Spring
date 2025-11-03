package com.uepa.br.arqsoftmvc.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserServiceClient {

    private final RestTemplate restTemplate;

    public UserServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getUserLanguage(long userId){
        System.out.println("Simulando SOA: buscando o idioma pelo ID do usuário: " + userId);
        if (userId == 1) {
            return "en";
        } else if (userId == 2) {
            return "es";
        }
        return "es";
    }
}
