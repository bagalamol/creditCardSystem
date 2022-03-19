package com.example.creditcard.CreditCardSystem.controller;

import com.example.creditcard.CreditCardSystem.Exception.InvalidCreditCardNumberException;
import com.example.creditcard.CreditCardSystem.model.CreditCard;
import com.example.creditcard.CreditCardSystem.service.CreditCardSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CreditCardController {

    @Autowired
    CreditCardSystem creditCardSystem;

    @GetMapping("/creditCards")
    @ResponseStatus(HttpStatus.OK)
    public List<CreditCard> getAllCreditCard() {
        return creditCardSystem.getAllCreditCardDetails();
    }

    @PostMapping("/creditCard")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCreditCardDetails(@RequestParam CreditCard creditCard) throws InvalidCreditCardNumberException {
         creditCardSystem.saveCreditCard(creditCard);
    }
}
