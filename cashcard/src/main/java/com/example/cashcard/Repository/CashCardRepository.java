package com.example.cashcard.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cashcard.Models.CashCard;

@Repository
public interface CashCardRepository extends JpaRepository<CashCard, Long>{
    
}
