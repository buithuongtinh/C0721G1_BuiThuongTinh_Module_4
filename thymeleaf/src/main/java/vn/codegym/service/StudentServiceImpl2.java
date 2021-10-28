package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Student;

import java.util.List;

@Service
public class StudentServiceImpl2 implements IStudentService{
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void save(Student student) {

    }
}
