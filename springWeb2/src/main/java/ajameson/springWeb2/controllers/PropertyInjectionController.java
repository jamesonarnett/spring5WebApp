package ajameson.springWeb2.controllers;

import ajameson.springWeb2.services.GreetingService;

public class PropertyInjectionController {
    public GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
