package com.thoughtowrks.feature_toggle_demo.application.use_for_configuration;

import com.thoughtowrks.feature_toggle_demo.features.DemoFeatures;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.togglz.spring.proxy.FeatureProxyFactoryBean;

@Component
public class WordServiceProxyBean {

    @Bean(name = "wordService")
    public FeatureProxyFactoryBean get() {
        FeatureProxyFactoryBean bean = new FeatureProxyFactoryBean();
        bean.setFeature(DemoFeatures.SAY_WORD.name());
        bean.setActive(new ActiveWordService());
        bean.setInactive(new InActiveWordService());
        return bean;
    }
}
