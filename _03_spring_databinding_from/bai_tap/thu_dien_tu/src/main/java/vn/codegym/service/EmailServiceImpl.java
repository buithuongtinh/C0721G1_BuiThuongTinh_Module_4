package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Email;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailServiceImpl implements IEmailService{
    private List<Email> emailList = new ArrayList<>();


    @Override
    public void saveEmail(Email email) {
       emailList.add(email);
    }
}
