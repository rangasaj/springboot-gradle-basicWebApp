package me.jaga.basics.springboot.gradle.service;

import me.jaga.basics.springboot.gradle.dao.GreetingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    @Autowired
    private GreetingDAO greetingDAO;

    public String getGreetingMessage() {
        return greetingDAO.getGreetingMessage();
    }
}
