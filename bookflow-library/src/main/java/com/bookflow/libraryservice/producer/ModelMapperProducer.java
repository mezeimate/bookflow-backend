package com.bookflow.libraryservice.producer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class ModelMapperProducer {

    @Produces
    @ApplicationScoped
    public ModelMapper create() {
        return new ModelMapper();
    }
}
