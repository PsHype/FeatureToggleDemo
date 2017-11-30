package com.thoughtowrks.demo;

import com.thoughtowrks.demo.feature_toggle.Features;
import org.springframework.stereotype.Service;

@Service
public class FeatureToggleService {
    String someResult() {
        if (Features.SAY_HEllO.isActive()) {
            return "hello";
        }
        return "hello featureToggle";
    }
}
