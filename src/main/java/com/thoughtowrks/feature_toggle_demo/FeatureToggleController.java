package com.thoughtowrks.feature_toggle_demo;

import com.thoughtowrks.feature_toggle_demo.use_for_config.WordService;
import com.thoughtowrks.feature_toggle_demo.use_for_hard_code.HelloToggleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeatureToggleController {

    private final HelloToggleService helloToggleService;

    private final WordService wordService;

    @Autowired
    public FeatureToggleController(HelloToggleService helloToggleService, WordService wordService) {
        this.helloToggleService = helloToggleService;
        this.wordService = wordService;
    }


    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloToggleService.someResult();
    }

    @ResponseBody
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public String word() {
        return wordService.someResult();
    }

}
