package com.uepa.br.arqsoftmvc.greeting.dto;

//outra classe para transportar dados, mas essa sera enviada ao
//cliente como resposta HTTP em json

public record GreetingResponse(String wellcome, String farewell) {}
