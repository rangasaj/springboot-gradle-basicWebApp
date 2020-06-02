package me.jaga.basics.springboot.gradle.dao;

import me.jaga.basics.springboot.gradle.domain.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerDAOTest {
    @Autowired
    private CustomerDAO customerDAO;

    @Test
    public void testInsertAndGetCustomer() {
        var customerId = -1L;
        Customer customer = new Customer(customerId, "name-1","occupation-1");
        customerDAO.insertCustomer(customer);

        Customer gotCustomer = customerDAO.findCustomerById(customerId);
        Assertions.assertEquals(customer,gotCustomer,"Customer got=" + gotCustomer);
    }
}
