package com.uepa.br.arqsoftmvc.greeting;

import com.uepa.br.arqsoftmvc.greeting.dto.GreetingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //Então aqui, a anotação pathvariable vincula o
    //valor da variável de caminho a um parâmetro de um metodo (no caso, userId).
    //Forma como o spring lida com rotas em uma api rest

    @GetMapping("/greetings/{userId}") //metodo HTTP GET tipico de rest APIs
    public GreetingResponse greeting(@PathVariable long userId) {
        return greetingService.getGreetingsForUser(userId);
    }
}

//@PathVariable é uma anotação do Spring em Java usada para extrair variáveis
// que fazem parte do próprio caminho da URL, como em um endpoint
// /usuarios/{id}, onde id é uma variável de caminho.
// Ela vincula o valor da variável de caminho a um parâmetro de um metodo,
//  permitindo que o código use esse valor para identificar e manipular
//  recursos específicos, como buscar um usuário com um ID específico.