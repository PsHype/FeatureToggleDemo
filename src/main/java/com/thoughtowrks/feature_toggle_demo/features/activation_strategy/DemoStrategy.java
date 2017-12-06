package com.thoughtowrks.feature_toggle_demo.features.activation_strategy;

import org.springframework.stereotype.Component;
import org.togglz.core.activation.Parameter;
import org.togglz.core.repository.FeatureState;
import org.togglz.core.spi.ActivationStrategy;
import org.togglz.core.user.FeatureUser;

@Component
public class DemoStrategy implements ActivationStrategy {
    @Override
    public String getId() {
        return "DemoStrategy";
    }

    @Override
    public String getName() {
        return "Demo Customize Strategy";
    }

    @Override
    public boolean isActive(FeatureState featureState, FeatureUser user) {
        return featureState.isEnabled();
    }

    @Override
    public Parameter[] getParameters() {
        return new Parameter[0];
    }
}
