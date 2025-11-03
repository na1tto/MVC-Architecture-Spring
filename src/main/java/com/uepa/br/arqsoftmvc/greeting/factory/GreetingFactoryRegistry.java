package com.uepa.br.arqsoftmvc.greeting.factory;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class GreetingFactoryRegistry {

    private final List<GreetingFactory> factories;
    private Map<String, GreetingFactory> factoryMap;

    public GreetingFactoryRegistry(List<GreetingFactory> factories) {
        this.factories = factories;
    }

    @PostConstruct
    public void init() {
        this.factoryMap = factories.stream()
                .collect(Collectors.toMap(GreetingFactory::getLanguageCode, Function.identity()));
    }

    public GreetingFactory getFactory(String languageCode) {
        return Optional.ofNullable(factoryMap.get(languageCode))
                .orElseThrow(() -> new IllegalArgumentException("Unsupported language: " + languageCode));
    }
}
