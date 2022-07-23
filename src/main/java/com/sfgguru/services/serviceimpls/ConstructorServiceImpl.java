package com.sfgguru.services.serviceimpls;

import com.sfgguru.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Guys --- Constructor";
    }

}
