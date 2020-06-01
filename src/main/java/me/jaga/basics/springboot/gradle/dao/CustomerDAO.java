package me.jaga.basics.springboot.gradle.dao;

import me.jaga.basics.springboot.gradle.domain.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerDAO {

    @Select("SELECT * FROM customer WHERE id=#{id}")
    Customer findCustomerById(Long id);

}