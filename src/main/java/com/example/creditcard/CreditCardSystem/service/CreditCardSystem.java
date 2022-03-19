package com.example.creditcard.CreditCardSystem.service;

import com.example.creditcard.CreditCardSystem.Exception.InvalidCreditCardNumberException;
import com.example.creditcard.CreditCardSystem.model.CreditCard;
import com.example.creditcard.CreditCardSystem.repository.CreditCardRepository;
import com.example.creditcard.CreditCardSystem.util.CreditCardValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreditCardSystem {

    @Autowired
    CreditCardRepository creditCardRepository;
    @Autowired
    CreditCardValidator creditCardValidator;

    public List<CreditCard> getAllCreditCardDetails() {
        return creditCardRepository.findAll().stream().collect(Collectors.toList());
    }

    public void saveCreditCard(CreditCard creditCard) throws InvalidCreditCardNumberException {
        if(!creditCardValidator.isValidCreditCardNumber(creditCard.getCardNumber())) {
            throw new InvalidCreditCardNumberException("Invalid Card Number");
        }
        creditCardRepository.save(creditCard);
    }
}
