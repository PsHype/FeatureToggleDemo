package com.thoughtowrks.demo.use_for_hard_code;

import com.thoughtowrks.demo.feature_toggle.DemoFeatures;
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
