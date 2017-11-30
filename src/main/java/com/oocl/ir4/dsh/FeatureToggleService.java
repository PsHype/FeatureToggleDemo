package com.oocl.ir4.dsh;

import com.oocl.ir4.dsh.feature_toggle.Features;
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
