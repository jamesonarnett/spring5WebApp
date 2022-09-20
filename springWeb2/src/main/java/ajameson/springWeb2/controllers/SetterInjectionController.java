package ajameson.springWeb2.controllers;

import ajameson.springWeb2.services.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
