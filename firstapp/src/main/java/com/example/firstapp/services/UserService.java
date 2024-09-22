package com.example.firstapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstapp.models.User;
import com.example.firstapp.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String addUser(User user ){       
        try {
            userRepository.save(user);
            
        } catch (Exception e) {
            return "Invalid arguments";
        }
        return "Added";

    }

    public Iterable<User> listUser(){
        
        return userRepository.findAll();
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();

    }
    
}
