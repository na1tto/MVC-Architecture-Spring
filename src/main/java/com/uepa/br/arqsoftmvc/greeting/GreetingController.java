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

    @GetMapping("/greetings/{userId}")
    public GreetingResponse greeting(@PathVariable long userId) {
        return greetingService.getGreetingsForUser(userId);
    }
}
