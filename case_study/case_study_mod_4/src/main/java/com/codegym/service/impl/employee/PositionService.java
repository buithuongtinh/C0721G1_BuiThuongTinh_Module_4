package com.codegym.service.impl.employee;

import com.codegym.model.employee.Position;
import com.codegym.repository.employee.IPositionRepository;
import com.codegym.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PositionService implements IPositionService {


    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public void save(Position position) {
        positionRepository.save(position);
    }

    @Override
    public void delete(int id) {
        positionRepository.deleteById(id);
    }

    @Override
    public Position findById(int id) {
        return positionRepository.findById(id).get();
    }

}
