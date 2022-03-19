package com.example.creditcard.CreditCardSystem.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler{
    @ExceptionHandler(InvalidCreditCardNumberException.class)
    public ResponseEntity<Object> throwInvalidCardNumber() {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
