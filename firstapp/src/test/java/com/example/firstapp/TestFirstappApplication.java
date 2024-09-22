package com.example.firstapp;

import org.springframework.boot.SpringApplication;

public class TestFirstappApplication {

	public static void main(String[] args) {
		SpringApplication.from(FirstappApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
