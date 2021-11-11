package com.codegym.su_dung_restful.service;

import com.codegym.su_dung_restful.model.Customer;
import com.codegym.su_dung_restful.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customers) {
        return customerRepository.save(customers);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}
