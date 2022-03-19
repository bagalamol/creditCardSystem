package com.example.creditcard.CreditCardSystem.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CreditCard {
    @Id
    private Optional<String> cardNumber;
    private String name;
    private double balance;
    @Builder.Default
    private long limit = 0;
}
