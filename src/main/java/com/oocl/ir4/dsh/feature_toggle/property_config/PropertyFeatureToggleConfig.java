package com.oocl.ir4.dsh.feature_toggle.property_config;

import com.google.common.io.Resources;
import com.oocl.ir4.dsh.feature_toggle.Features;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;

import java.io.File;
import java.net.URL;

@Configuration
public class PropertyFeatureToggleConfig implements TogglzConfig {
    @Override
    public Class<? extends Feature> getFeatureClass() {
        return Features.class;
    }

    @Override
    public StateRepository getStateRepository() {
        URL resource = Resources.getResource("features_toggle.properties");
        return new FileBasedStateRepository(new File(resource.toString()));
    }

    @Override
    public UserProvider getUserProvider() {
        return new ServletUserProvider("admin");
    }

}
