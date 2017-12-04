package com.thoughtowrks.feature_toggle_demo;

import com.thoughtowrks.feature_toggle_demo.config.DemoFeatures;
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
    public void should_say_hello_when_toggle_on() throws Exception {
        togglzRule.enable(DemoFeatures.SAY_HEllO);
        Assert.assertEquals("hello", featureToggleController.hello());
    }

    @Test
    public void should_say_bad_boy_hello_when_toggle_off() throws Exception {
        togglzRule.disable(DemoFeatures.SAY_HEllO);
        Assert.assertEquals("bad boy", featureToggleController.hello());
    }

    @Test
    public void should_say_word_when_toggle_on() {
        togglzRule.enable(DemoFeatures.SAY_WORD);
        Assert.assertEquals("word", featureToggleController.word());
    }

    @Test
    public void should_say_bad_girl_when_toggle_off() {
        togglzRule.disable(DemoFeatures.SAY_WORD);
        Assert.assertEquals("bad girl", featureToggleController.word());
    }
}