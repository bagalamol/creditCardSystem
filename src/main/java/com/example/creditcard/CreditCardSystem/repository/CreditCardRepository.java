package com.example.creditcard.CreditCardSystem.repository;

import com.example.creditcard.CreditCardSystem.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
