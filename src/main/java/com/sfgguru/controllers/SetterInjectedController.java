package com.sfgguru.controllers;

import com.sfgguru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;


    @Qualifier("setterServiceImpl")
    @Autowired
    public void setGreetingService(@Qualifier("setterServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.sayGreeting();
    }


}
