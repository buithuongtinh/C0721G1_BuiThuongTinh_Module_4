package com.codegym.service.impl;

import com.codegym.model.MyUserDetail;
import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRespository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRespository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User name :" + username + "not fount");
        }
        return new MyUserDetail(user);
    }
}