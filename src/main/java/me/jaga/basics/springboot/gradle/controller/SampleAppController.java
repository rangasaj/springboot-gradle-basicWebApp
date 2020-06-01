package me.jaga.basics.springboot.gradle.controller;

import me.jaga.basics.springboot.gradle.service.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleAppController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/")
    public String index() {
        return greetingService.getGreetingMessage();
    }

}
