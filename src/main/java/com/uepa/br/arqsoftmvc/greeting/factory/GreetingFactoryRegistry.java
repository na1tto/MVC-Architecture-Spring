package com.uepa.br.arqsoftmvc.greeting.factory;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

// Classe da Fabrica Concreta, ela tem a tarefa de criar
// as familias com seus respectivos comportamentos (en, es, pt)

@Component
public class GreetingFactoryRegistry {

    private final List<GreetingFactory> factories;
    private Map<String, GreetingFactory> factoryMap;

    //Injetando as instâncias das factories numa lista.
    public GreetingFactoryRegistry(List<GreetingFactory> factories) {
        this.factories = factories;
    }

    //Aqui ele pega a list e transforma num Map, onde cada código de linguagem
    //aponta para sua implementação concreta (Ex.: O "es" aponta para Spanish)
    @PostConstruct
    public void init() {
        this.factoryMap = factories.stream()
                .collect(Collectors.toMap(GreetingFactory::getLanguageCode, Function.identity()));
    }

    //Aqui é o metodo que o cliente utiliza quando acessa o endpoint
    //é uma consulta no Map, que foi criada anteriormente
    //caso não encontre a linguagem, ele devolve um erro
    public GreetingFactory getFactory(String languageCode) {
        return Optional.ofNullable(factoryMap.get(languageCode))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported language: " + languageCode));
    }
}