package com.thoughtowrks.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-test-context.xml"})
public class SkillGroupControllerTest {

    @Autowired
    private FeatureToggleController featureToggleController;

    @Test
    public void should_return_200() throws Exception {
        String result = featureToggleController.hi();
        Assert.assertEquals("hello featureToggle", result);
    }
    
}