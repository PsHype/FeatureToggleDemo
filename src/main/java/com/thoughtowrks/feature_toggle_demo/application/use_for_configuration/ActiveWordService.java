package com.thoughtowrks.feature_toggle_demo.application.use_for_configuration;

public class ActiveWordService implements WordService {
    @Override
    public String someResult() {
        return "word";
    }
}
