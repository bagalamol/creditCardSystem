package com.example.creditcard.CreditCardSystem.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class CreditCardValidator {
    public boolean isValidCreditCardNumber(Optional<String> creditCardNumber)
    {
        // int array for processing the cardNumber
        String cardNumber = creditCardNumber.get();
        int[] cardIntArray=new int[cardNumber.length()];

        for(int i=0;i<cardNumber.length();i++)
        {
            char c= cardNumber.charAt(i);
            cardIntArray[i]=  Integer.parseInt(""+c);
        }

        for(int i=cardIntArray.length-2;i>=0;i=i-2)
        {
            int num = cardIntArray[i];
            num = num * 2;  // step 1
            if(num>9)
            {
                num = num%10 + num/10;  // step 2
            }
            cardIntArray[i]=num;
        }

        int sum = sumDigits(cardIntArray);  // step 3

        System.out.println(sum);

        if(sum%10==0)  // step 4
        {
            return true;
        }

        return false;

    }

    public static int sumDigits(int[] arr)
    {
        return Arrays.stream(arr).sum();
    }
}

