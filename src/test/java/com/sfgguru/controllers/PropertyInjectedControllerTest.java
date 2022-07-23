package com.sfgguru.controllers;

import com.sfgguru.services.serviceimpls.ConstructorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorServiceImpl();

    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());

    }
}