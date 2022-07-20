package com.sfgguru;

import com.sfgguru.controllers.MyController;
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

        System.out.println("----------------------------------");
        myController.secondGreeting();
    }

}
