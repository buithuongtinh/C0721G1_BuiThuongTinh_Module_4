package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Person;


import java.util.ArrayList;
import java.util.List;


@Service
public class PersonService  implements IPersonService{

    private List<Person> personList = new ArrayList<>();

    @Override
    public void save(Person person) {
         personList.add(person);
    }
}
