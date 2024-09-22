package com.example.firstapp.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/")
    public String getProduct() {
        return new String("response form product");
    }
    
    
}
