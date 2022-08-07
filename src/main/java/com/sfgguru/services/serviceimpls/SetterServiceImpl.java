package com.sfgguru.services.serviceimpls;

import com.sfgguru.services.GreetingService;
import org.springframework.stereotype.Service;


public class SetterServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Guys --- Setter";
    }
}
