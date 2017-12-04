package com.thoughtowrks.feature_toggle_demo.features;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum DemoFeatures implements Feature {

    @Label("should return hello ")
    SAY_HEllO,

    @Label("should return word ")
    SAY_WORD,

    @Label("test foreach loop")
    @Performance
    FOR_EACH,

    @Label("test stream loop")
    @Performance
    STREAM;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }

}
