package com.thoughtowrks.feature_toggle_demo.features;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.togglz.core.bootstrap.TogglzBootstrap;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.spi.ActivationStrategy;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

@Component
public class DemoFeatureManager implements TogglzBootstrap {

    @Autowired
    private StateRepository stateRepository;

    @Autowired(required = false)
    private UserProvider userProvider;

    @Autowired
    private ActivationStrategy activationStrategy;


    @Override
    public FeatureManager createFeatureManager() {

        return new FeatureManagerBuilder()
            .featureEnum(DemoFeatures.class)
            .userProvider(userProvider == null ? defaultUserProvider() : userProvider)
            .stateRepository(stateRepository)
            .activationStrategy(activationStrategy)
            .build();
    }


    private UserProvider defaultUserProvider() {
        return new UserProvider() {
            @Override
            public FeatureUser getCurrentUser() {
                return new SimpleFeatureUser("admin", true);
            }
        };
    }

}
