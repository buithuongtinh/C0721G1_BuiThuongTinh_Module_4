package vn.codegym.thuc_hanh_2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.thuc_hanh_2.model.Customer;
import vn.codegym.thuc_hanh_2.model.Province;

import java.awt.print.Pageable;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
