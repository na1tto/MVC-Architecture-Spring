package com.uepa.br.arqsoftmvc.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

//Objeto que serve para trasitar dados dentro da aplicacao,
//nesse caso para a GreetingService
public record UserLanguageResponse(String language) {}
