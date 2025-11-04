package com.uepa.br.arqsoftmvc.greeting.factory.impl;

import com.uepa.br.arqsoftmvc.greeting.factory.GreetingFactory;
import com.uepa.br.arqsoftmvc.greeting.factory.model.FarewellGreeting;
import com.uepa.br.arqsoftmvc.greeting.factory.model.WellcomeGreeting;
import org.springframework.stereotype.Component;

// classe de implementacao, nela os comportamentos sao implementados de forma concreta
// esse eh o "produto" que a nossa abstract factory produz

@Component
public class EnglishGreetingFactory implements GreetingFactory {

    @Override
    public WellcomeGreeting createWellcome(){
        return () -> "Hello!";
    }

    @Override
    public FarewellGreeting createFarewell(){
        return () -> "Goodbye!";
    }

    @Override
    public String getLanguageCode(){
        return "en";
    }
}
