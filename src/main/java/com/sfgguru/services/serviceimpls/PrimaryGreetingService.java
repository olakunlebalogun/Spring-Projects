package com.sfgguru.services.serviceimpls;

import com.sfgguru.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello guys ---> this is the primary greeting service";

    }
}
