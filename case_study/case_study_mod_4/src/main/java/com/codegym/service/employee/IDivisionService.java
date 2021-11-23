package com.codegym.service.employee;

import com.codegym.model.employee.Division;

import java.util.List;

public interface IDivisionService {
    List<Division> findAll();

    void save(Division division);

    void delete(int id);

    Division findById(int id);
}
