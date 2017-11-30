package com.thoughtowrks.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/OOCL")
public class FeatureToggleController {

    private final FeatureToggleService featureToggleService;

    @Autowired
    public FeatureToggleController(FeatureToggleService featureToggleService) {
        this.featureToggleService = featureToggleService;
    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String hi() {
        return featureToggleService.someResult();
    }

}
