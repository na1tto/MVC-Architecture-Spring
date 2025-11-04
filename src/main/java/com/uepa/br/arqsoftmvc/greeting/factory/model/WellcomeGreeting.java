package com.uepa.br.arqsoftmvc.greeting.factory.model;

// classe que define a familia abstrata que queremos descrever
// nesse caso a familia de Despedidas, elas serao implementadas
// pelas familia concretas (en, es, pt)

public interface WellcomeGreeting {
    String getGreeting();
}
