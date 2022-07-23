package com.sfgguru.controllers;

import com.sfgguru.services.serviceimpls.ConstructorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorServiceImpl());
    }


    @Test
    void getGreetings() {
        controller.getGreetings();
    }
}