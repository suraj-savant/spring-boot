package com.example.firstapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.firstapp.models.User;
import com.example.firstapp.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;






@RestController
@RequestMapping("/users")
public class UserController {   
    @Autowired 
    private UserService userService;
    @GetMapping("/")
    public String gerUser() {
        return new String("response form user updated");
    }

    @GetMapping("/msg")
    public String messageRoute() {
        return new String("new path added");
    }

    @PostMapping("/create")
    public String postMethodName(@RequestBody User user) {
       return userService.addUser(user);
    }

    @PostMapping("/delete")
    public String deleteUsers() {
        userService.deleteAllUsers();
        return "Deleted All Users";
    }
    

    @GetMapping("/all")
    public @ResponseBody Iterable<User> listAllUsers() {
        return userService.listUser();
    }
    
    
    
    
}
