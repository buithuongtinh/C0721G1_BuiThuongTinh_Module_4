package com.codegym.service.impl.employee;

import com.codegym.model.employee.Division;
import com.codegym.repository.employee.IDivisionRepository;
import com.codegym.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public void save(Division division) {
        divisionRepository.save(division);
    }

    @Override
    public void delete(int id) {
        divisionRepository.deleteById(id);
    }

    @Override
    public Division findById(int id) {
        return divisionRepository.findById(id).get();
    }

}
