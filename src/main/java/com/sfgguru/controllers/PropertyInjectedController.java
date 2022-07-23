package com.sfgguru.controllers;

import com.sfgguru.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreetings () {
        return  greetingService.sayGreeting();
    }
}
