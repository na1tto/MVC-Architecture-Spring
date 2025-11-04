package com.uepa.br.arqsoftmvc.greeting;

import com.uepa.br.arqsoftmvc.client.UserServiceClient;
import com.uepa.br.arqsoftmvc.client.dto.UserLanguageResponse;
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

    //coracao do processamento da aplicacao, aqui ocorrem as chamdas de funcoes
    //que irao fornecer o fluxo necessário de dados para realizar a logica que
    //pensamos
    public GreetingResponse getGreetingsForUser(long userId) {

        UserLanguageResponse responseDto = userClient.getUserLanguage(userId);

        String language = responseDto.language();

        GreetingFactory factory = factoryRegistry.getFactory(language);

        WellcomeGreeting welcome = factory.createWellcome();
        FarewellGreeting farewell = factory.createFarewell();
        return new GreetingResponse(welcome.getGreeting(), farewell.getGreeting()); // retornando uma resposta
    }
}