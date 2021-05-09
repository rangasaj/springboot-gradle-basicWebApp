package me.jaga.basics.springboot.gradle.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id) &&
                Objects.equals(customerName, customer.customerName) &&
                Objects.equals(occupation, customer.occupation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, occupation);
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
