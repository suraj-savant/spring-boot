package com.example.cashcard;

import org.springframework.boot.SpringApplication;

public class TestCashcardApplication {

	public static void main(String[] args) {
		SpringApplication.from(CashcardApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
