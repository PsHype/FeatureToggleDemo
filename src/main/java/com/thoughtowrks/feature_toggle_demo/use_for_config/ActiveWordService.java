package com.thoughtowrks.feature_toggle_demo.use_for_config;

public class ActiveWordService implements WordService {
    @Override
    public String someResult() {
        return "word";
    }
}
