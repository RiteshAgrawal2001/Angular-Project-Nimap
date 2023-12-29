package com.project.controller;

import com.project.entity.Users;
import com.project.service.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class RegisterUser {
    @Autowired
    Register register;
    @RequestMapping("registerUser")
    public boolean registerUser(@RequestBody Users user){
        return register.registerUser(user);

    }

}
