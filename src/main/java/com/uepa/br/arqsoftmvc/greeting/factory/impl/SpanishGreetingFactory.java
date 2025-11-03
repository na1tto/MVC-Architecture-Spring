package com.uepa.br.arqsoftmvc.greeting.factory.impl;

import com.uepa.br.arqsoftmvc.greeting.factory.GreetingFactory;
import com.uepa.br.arqsoftmvc.greeting.factory.model.FarewellGreeting;
import com.uepa.br.arqsoftmvc.greeting.factory.model.WellcomeGreeting;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreetingFactory implements GreetingFactory {

    @Override
    public WellcomeGreeting createWellcome() {
        return () -> "Hola!";
    }

    @Override
    public FarewellGreeting createFarewell() {
        return () -> "Adios!";
    }

    @Override
    public String getLanguageCode(){
        return "es";
    }
}
