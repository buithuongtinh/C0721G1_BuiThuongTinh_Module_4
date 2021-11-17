package com.codegym.bt_1.repository;

import com.codegym.bt_1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
