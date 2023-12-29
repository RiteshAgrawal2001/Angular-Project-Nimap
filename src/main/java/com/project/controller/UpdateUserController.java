package com.project.controller;

import com.project.entity.Users;
import com.project.service.UpdateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class UpdateUserController {
    @Autowired
    UpdateUser updateUser;
    @RequestMapping("updateUser")
    public boolean updateUser(@RequestBody Users users){
        return updateUser.updateUser(users);

}
}
