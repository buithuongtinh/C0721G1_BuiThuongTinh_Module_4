package com.codegym.service.employee;

import com.codegym.model.employee.EducationDegree;

import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> findAll();

    void save(EducationDegree educationDegree);

    void delete(int id);

    EducationDegree findById(int id);
}
