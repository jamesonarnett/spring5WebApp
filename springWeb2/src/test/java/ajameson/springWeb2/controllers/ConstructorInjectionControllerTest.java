package ajameson.springWeb2.controllers;

import ajameson.springWeb2.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    /* preferred method of implementation */
    //best practice

    ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new ConstructorGreetingService());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.sayGreeting());
    }
}