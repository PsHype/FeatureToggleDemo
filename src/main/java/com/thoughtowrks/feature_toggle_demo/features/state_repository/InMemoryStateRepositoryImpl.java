package com.thoughtowrks.feature_toggle_demo.features.state_repository;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;

@Repository
public class InMemoryStateRepositoryImpl {
    @Bean
    public StateRepository getStateRepository() {
        return new InMemoryStateRepository();
    }

}
