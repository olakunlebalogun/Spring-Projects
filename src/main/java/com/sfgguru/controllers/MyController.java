package com.sfgguru.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hi Folks!");

        return "doing great fellas";
    }

    public void secondGreeting () {
        System.out.println("Eku three days");
    }
}
