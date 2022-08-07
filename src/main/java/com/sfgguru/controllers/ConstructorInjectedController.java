package com.sfgguru.controllers;

import com.sfgguru.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings () {
        return  greetingService.sayGreeting();
    }

}
