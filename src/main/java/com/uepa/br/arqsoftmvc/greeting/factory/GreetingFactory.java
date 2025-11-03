package com.uepa.br.arqsoftmvc.greeting.factory;

import com.uepa.br.arqsoftmvc.greeting.factory.model.FarewellGreeting;
import com.uepa.br.arqsoftmvc.greeting.factory.model.WellcomeGreeting;

public interface GreetingFactory {
    WellcomeGreeting createWellcome();
    FarewellGreeting createFarewell();
    String getLanguageCode();
}
