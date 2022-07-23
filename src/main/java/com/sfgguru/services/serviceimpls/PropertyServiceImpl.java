package com.sfgguru.services.serviceimpls;

import com.sfgguru.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello guys --- Property";
    }
}
