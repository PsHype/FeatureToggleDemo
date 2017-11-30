package com.oocl.ir4.dsh.feature_toggle.property_config;

import com.google.common.io.Resources;
import org.junit.Test;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PropertyFeatureToggleConfigTest {
    @Test
    public void test_read_resources() {
        URL resource = Resources.getResource("features_toggle.properties");
        File file = new File(resource.toString());
        assertNotNull(file);
        assertEquals("features_toggle.properties", file.getName());
        assertNotNull(resource);
    }
}