package com.sfgguru;

import com.sfgguru.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThymeleafSfgApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ThymeleafSfgApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println("------------------- I18n for EN and ES");
        System.out.println(i18nController.sayThankYou());

        System.out.println("---------------------------------- Primary Bean");
        myController.secondGreeting();

        System.out.println("-------------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreetings());

        System.out.println("---------------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetings());

        System.out.println("-----------------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetings());


    }

}
