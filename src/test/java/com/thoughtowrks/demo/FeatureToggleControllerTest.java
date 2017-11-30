package com.thoughtowrks.demo;

import com.thoughtowrks.demo.feature_toggle.DemoFeatures;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.togglz.junit.TogglzRule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-test-context.xml"})
public class FeatureToggleControllerTest {

    @Rule
    public TogglzRule togglzRule = TogglzRule.builder(DemoFeatures.class).build();

    @Autowired
    private FeatureToggleController featureToggleController;


    @Test
    public void should_return_hello_when_toggle_on() throws Exception {
        togglzRule.enable(DemoFeatures.SAY_HEllO);
        Assert.assertEquals("hello", featureToggleController.hi());
    }

    @Test
    public void should_not_return_hello_when_toggle_off() throws Exception {
        togglzRule.disable(DemoFeatures.SAY_HEllO);
        Assert.assertEquals("hello feature toggle", featureToggleController.hi());
    }


}