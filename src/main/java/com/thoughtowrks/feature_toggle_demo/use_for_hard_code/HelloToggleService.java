package com.thoughtowrks.feature_toggle_demo.use_for_hard_code;

import com.thoughtowrks.feature_toggle_demo.config.DemoFeatures;
import org.springframework.stereotype.Service;

@Service
public class HelloToggleService {
    public String someResult() {
        if (DemoFeatures.SAY_HEllO.isActive()) {
            return "hello";
        }
        return "bad boy";
    }
}
