package com.codegym.bt_1.service;

import com.codegym.bt_1.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer);
}
