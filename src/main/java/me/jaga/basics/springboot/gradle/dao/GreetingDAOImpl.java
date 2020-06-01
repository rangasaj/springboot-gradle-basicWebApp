package me.jaga.basics.springboot.gradle.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingDAOImpl  implements GreetingDAO {

    @Autowired
    private  CustomerDAO customerDAO;

    @Override
    public String getGreetingMessage() {
        return "Welcome Greetings!" + customerDAO.findCustomerById(1L);
    }
}
