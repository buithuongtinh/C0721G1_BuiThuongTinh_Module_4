package vn.codegym.thuc_hanh_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import vn.codegym.thuc_hanh_2.model.Customer;
import vn.codegym.thuc_hanh_2.model.Province;
import vn.codegym.thuc_hanh_2.repository.ICustomerRepository;

import java.awt.print.Pageable;


@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepo;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepo.findAll( pageable);
    }

    @Override
    public Customer findById(Long id) {
        return this.iCustomerRepo.findById(id).get();
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepo.save(customer);
    }

    @Override
    public void remove(Long id) {
        this.iCustomerRepo.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return this.iCustomerRepo.findAllByProvince(province);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return this.iCustomerRepo.findAllByFirstNameContaining(firstname, pageable);
    }
}
