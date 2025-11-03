package com.uepa.br.arqsoftmvc.greeting.factory.impl;

import com.uepa.br.arqsoftmvc.greeting.factory.GreetingFactory;
import com.uepa.br.arqsoftmvc.greeting.factory.model.FarewellGreeting;
import com.uepa.br.arqsoftmvc.greeting.factory.model.WellcomeGreeting;
import org.springframework.stereotype.Component;

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
