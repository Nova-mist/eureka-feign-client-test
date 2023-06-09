package org.example.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingClient greetingClient;
    @RequestMapping("/get-greeting")
    public String greeting() {
        return greetingClient.greeting();
        // return "hello";
    }
}
