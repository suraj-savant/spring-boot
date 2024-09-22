package com.example.cashcard.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cashcard.Models.CashCard;
import com.example.cashcard.Setvices.CashCardService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/cardcontroller")
public class CardController {
    @Autowired
    private CashCardService cashCardService;

    @GetMapping("/{id}")
    public String getCard(@PathVariable Long id) {

        return new String();
    }

    @PostMapping("/add")
    public ResponseEntity<CashCard> createCard(@RequestBody CashCard cashCard) {
        try {
            cashCardService.createCashCard(cashCard);
            return ResponseEntity.ok(cashCard);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CashCard());
        }
    }

    @GetMapping("/list")
    public ResponseEntity<Iterable<CashCard>> getAllCashCard(){
       
        Iterable<CashCard> data =  cashCardService.listCashCard();
        return ResponseEntity.ok(data);
      
    }
    

}
