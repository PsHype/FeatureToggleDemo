package com.thoughtowrks.demo;

import com.thoughtowrks.demo.feature_toggle.DemoFeatures;
import org.springframework.stereotype.Service;

@Service
public class FeatureToggleService {
    String someResult() {
        if (DemoFeatures.SAY_HEllO.isActive()) {
            return "hello";
        }
        return "hello feature toggle";
    }
}
