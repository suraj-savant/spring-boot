package com.example.firstapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstapp.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
