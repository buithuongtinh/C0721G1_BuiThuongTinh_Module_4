package com.codegym.service.employee;

import com.codegym.model.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();

    void save(Position position);

    void delete(int id);

    Position findById(int id);
}
