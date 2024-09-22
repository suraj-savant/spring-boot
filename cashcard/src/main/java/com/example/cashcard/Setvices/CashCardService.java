package com.example.cashcard.Setvices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cashcard.Models.CashCard;
import com.example.cashcard.Repository.CashCardRepository;

@Service
public class CashCardService {
    @Autowired
    private CashCardRepository cashCardRepository;

    public CashCard createCashCard(CashCard cashCard) throws IllegalArgumentException{
       return cashCardRepository.save(cashCard); 
    }

    public Iterable<CashCard> listCashCard() throws IllegalArgumentException{
       return cashCardRepository.findAll();
    }
}
