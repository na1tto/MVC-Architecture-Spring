package com.uepa.br.arqsoftmvc.greeting.factory;

import com.uepa.br.arqsoftmvc.greeting.factory.model.FarewellGreeting;
import com.uepa.br.arqsoftmvc.greeting.factory.model.WellcomeGreeting;

//classe de Fabrica Abstrata, ela fornece as interfaces
//que definem o comportamento da familia de classes que queremos descrever

public interface GreetingFactory {
    WellcomeGreeting createWellcome();
    FarewellGreeting createFarewell();
    String getLanguageCode();
}
