package com.codegym.repository.employee;

import com.codegym.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findEmployeeByEmployeeName(String name, Pageable pageable);

    @Query(value = "select * \n" +
            "from employee\n" +
            "where employee_name = ?1 or employee_email = ?1 ", nativeQuery = true)
    Page<Employee> search(String search,Pageable pageable);
}
