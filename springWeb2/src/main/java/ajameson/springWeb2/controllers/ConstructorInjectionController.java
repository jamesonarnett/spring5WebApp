package ajameson.springWeb2.controllers;

import ajameson.springWeb2.services.GreetingService;

public class ConstructorInjectionController {
    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
