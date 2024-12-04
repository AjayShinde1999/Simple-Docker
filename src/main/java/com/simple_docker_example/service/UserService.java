package com.simple_docker_example.service;

import com.simple_docker_example.model.User;
import com.simple_docker_example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
