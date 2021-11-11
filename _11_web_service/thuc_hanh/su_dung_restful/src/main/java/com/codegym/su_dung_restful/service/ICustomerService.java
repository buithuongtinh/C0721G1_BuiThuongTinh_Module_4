package com.codegym.su_dung_restful.service;

import com.codegym.su_dung_restful.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(Long id);


    Customer save(Customer customers);

    void remove(Long id);
}
