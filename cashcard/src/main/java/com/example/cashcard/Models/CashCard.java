package com.example.cashcard.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    double amount;

    public CashCard(){

    }

    public CashCard(Long id, double amount){
        this.id = id;
        this.amount = amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    
}
