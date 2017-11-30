package com.oocl.ir4.dsh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:helloword-test-context.xml"})
public class SkillGroupControllerTest {

    @Autowired
    private FeatureToggleController skillGroupController;

    @Test
    public void should_return_200() throws Exception {
        String result = skillGroupController.hi();
        Assert.assertEquals("HelloOOCL", result);
    }
    
}