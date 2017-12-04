package com.thoughtowrks.feature_toggle_demo.application.use_for_configuration;

public class InActiveWordService implements WordService {
    @Override
    public String someResult() {
        return "bad girl";
    }
}
