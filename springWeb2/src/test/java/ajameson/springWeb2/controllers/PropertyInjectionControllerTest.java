package ajameson.springWeb2.controllers;

import ajameson.springWeb2.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    //least preferred method of implementation

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.greetingService.sayGreeting());
    }
}