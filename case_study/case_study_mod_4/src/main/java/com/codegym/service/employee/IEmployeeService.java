package com.codegym.service.employee;

import com.codegym.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    List<Employee> findAll();

    void save(Employee employee);

//   void delete (Employee employee);
    void delete(int id);

    Employee findById(int id);

    Page<Employee> findCustomerByCustomerName(String name, Pageable pageable);

    Page<Employee> find(String search,Pageable pageable);
}
