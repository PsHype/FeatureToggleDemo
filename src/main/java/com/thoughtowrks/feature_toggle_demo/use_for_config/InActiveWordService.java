package com.thoughtowrks.feature_toggle_demo.use_for_config;

public class InActiveWordService implements WordService {
    @Override
    public String someResult() {
        return "bad girl";
    }
}
