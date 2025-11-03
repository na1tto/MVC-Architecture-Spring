package com.uepa.br.arqsoftmvc.greeting;

import com.uepa.br.arqsoftmvc.client.UserServiceClient;
import com.uepa.br.arqsoftmvc.greeting.dto.GreetingResponse;
import com.uepa.br.arqsoftmvc.greeting.factory.GreetingFactory;
import com.uepa.br.arqsoftmvc.greeting.factory.GreetingFactoryRegistry;
import com.uepa.br.arqsoftmvc.greeting.factory.model.FarewellGreeting;
import com.uepa.br.arqsoftmvc.greeting.factory.model.WellcomeGreeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final UserServiceClient userClient;
    private final GreetingFactoryRegistry factoryRegistry;

    public GreetingService(UserServiceClient userClient, GreetingFactoryRegistry factoryRegistry) {
        this.userClient = userClient;
        this.factoryRegistry = factoryRegistry;
    }

    public GreetingResponse getGreetingsForUser(long userId) {

        String language = userClient.getUserLanguage(userId);

        GreetingFactory factory = factoryRegistry.getFactory(language);

        WellcomeGreeting welcome = factory.createWellcome();
        FarewellGreeting farewell = factory.createFarewell();

        return new GreetingResponse(welcome.getGreeting(), farewell.getGreeting());
    }
}
