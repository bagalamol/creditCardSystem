package com.example.creditcard.CreditCardSystem.Exception;

public class InvalidCreditCardNumberException extends Exception {
    public InvalidCreditCardNumberException(String errorMessage) {
        super(errorMessage);
    }
}
