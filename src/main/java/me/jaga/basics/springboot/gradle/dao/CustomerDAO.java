package me.jaga.basics.springboot.gradle.dao;

import me.jaga.basics.springboot.gradle.domain.Customer;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CustomerDAO {

    @Results(id = "customerResult", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "customerName", column = "customer_name"),
            @Result(property = "occupation", column = "occupation")
    })
    @Select("SELECT id, customer_name, occupation FROM customer WHERE id=#{id}")
    Customer findCustomerById(Long id);

    @Insert("INSERT INTO customer (id,customer_name,occupation) VALUES (#{id}, #{customerName}, #{occupation})")
    void insertCustomer(Customer customer);

}