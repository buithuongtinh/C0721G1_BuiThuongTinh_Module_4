package service;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IUserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

}
