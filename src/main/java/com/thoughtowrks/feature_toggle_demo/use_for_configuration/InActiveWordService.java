package com.thoughtowrks.feature_toggle_demo.use_for_configuration;

public class InActiveWordService implements WordService {
    @Override
    public String someResult() {
        return "bad girl";
    }
}
