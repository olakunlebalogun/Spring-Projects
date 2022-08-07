package com.sfgguru.config;

import com.sfgguru.controllers.*;
import com.sfgguru.services.GreetingService;
import com.sfgguru.services.serviceimpls.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class JavaConfigurationType {

    // Controller
    @Bean
    public MyController myController(GreetingService greetingService) {
        return new MyController(greetingService);
    }

    @Bean
    public I18nController i18nController(GreetingService greetingService) {
        return new I18nController(greetingService);
    }
    @Bean
    @Qualifier("propertyServiceImpl")
    public PropertyInjectedController propertyInjectedController(GreetingService greetingService) {
        return new PropertyInjectedController();
    }

    @Bean
    @Qualifier("constructorServiceImpl")
    public ConstructorInjectedController constructorInjectedController(GreetingService greetingService) {
        return new ConstructorInjectedController(greetingService);
    }



    @Bean
    @Qualifier("setterServiceImpl")
    public SetterInjectedController setterInjectedController(GreetingService greetingService) {
        return new SetterInjectedController();
    }



    // Greeting Service
   public GreetingService greetingService;

    // Service Implementations
    @Bean
    public ConstructorServiceImpl constructorServiceImpl() {
        return new ConstructorServiceImpl();
    }

    @Bean
    public PropertyServiceImpl propertyServiceImpl() {
        return new PropertyServiceImpl();
    }

    @Bean
    public SetterServiceImpl setterServiceImpl(){
        return new SetterServiceImpl();
    }


    @Primary
    @Bean
    public PrimaryGreetingService primaryGreetingService() {
        return  new PrimaryGreetingService();
    }

    // The ones with @Profile
    @Bean
    @Profile("EN")
    public I18nEnglishGreetingService i18nEnglishGreetingService() {
        return new I18nEnglishGreetingService();
    }

    @Bean
    @Profile({"ES", "default"})
    public I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }


}
