package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Email;
@Service
public interface IEmailService {

     void saveEmail(Email email);
}
