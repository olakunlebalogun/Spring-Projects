package com.sfgguru.controllers;

import com.sfgguru.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hi Folks!");

        return this.greetingService.sayGreeting();
    }

    public void secondGreeting () {
        System.out.println("Eku three days");
    }
}
