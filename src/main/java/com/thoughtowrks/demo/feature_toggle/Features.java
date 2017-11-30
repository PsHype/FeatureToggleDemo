package com.thoughtowrks.demo.feature_toggle;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum Features implements Feature {

    @Label("should return hello ")
    SAY_HEllO;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}
