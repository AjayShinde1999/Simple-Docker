package com.simple_docker_example.controller;

import com.simple_docker_example.model.User;
import com.simple_docker_example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(){
        return "W E L C O M E";
    }

    @GetMapping("/show")
    public String show(){
        return "3K Technologies";
    }

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> saveOneUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
    }

}
