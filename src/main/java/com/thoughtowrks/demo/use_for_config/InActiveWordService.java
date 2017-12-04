package com.thoughtowrks.demo.use_for_config;

public class InActiveWordService implements WordInterface {
    @Override
    public String someResult() {
        return "bad girl";
    }
}
