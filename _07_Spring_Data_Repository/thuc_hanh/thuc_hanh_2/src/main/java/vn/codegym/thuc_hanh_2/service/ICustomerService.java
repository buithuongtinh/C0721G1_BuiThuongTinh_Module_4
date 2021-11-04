package vn.codegym.thuc_hanh_2.service;

import org.springframework.data.domain.Page;
import vn.codegym.thuc_hanh_2.model.Customer;
import vn.codegym.thuc_hanh_2.model.Province;

import java.awt.print.Pageable;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
