package vn.codegym.service;

import vn.codegym.model.Login;
import vn.codegym.model.User;
import vn.codegym.repository.UserRepository;

public class UserService {
    public static User checkLogin (Login login) {
        return UserRepository.checkLogin(login);
    }
}
