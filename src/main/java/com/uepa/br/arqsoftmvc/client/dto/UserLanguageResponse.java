package com.uepa.br.arqsoftmvc.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record UserLanguageResponse(String language) {}
