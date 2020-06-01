package me.jaga.basics.springboot.gradle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private Long id;

    private String customerName;
    private String occupation;

    protected Customer() {
    }

    public Customer(Long id, String customerName, String occupation) {
        this.id = id;
        this.customerName = customerName;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, customerName='%s', Occupation'%s']",
                id, customerName, occupation);
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOccupation() {
        return occupation;
    }
}
