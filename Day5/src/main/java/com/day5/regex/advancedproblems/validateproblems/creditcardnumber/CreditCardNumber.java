package com.day5.regex.advancedproblems.validateproblems.creditcardnumber;

import java.util.regex.Pattern;
import java.util.regex.*;
public class CreditCardNumber {
        public static boolean isValidCreditCard(String cardNumber) {
            // Visa card: starts with 4 and has 16 digits
            String visaRegex = "^4\\d{15}$";
            // MasterCard: starts with 5 and has 16 digits
            String masterCardRegex = "^5\\d{15}$";

            return Pattern.matches(visaRegex, cardNumber) || Pattern.matches(masterCardRegex, cardNumber);
        }

        public static void main(String[] args) {
            String cardNumber1 = "4123456789012345";
            String cardNumber2 = "5123456789012345";
            String cardNumber3 = "6123456789012345";

            System.out.println(isValidCreditCard(cardNumber1));
            System.out.println(isValidCreditCard(cardNumber2));
            System.out.println(isValidCreditCard(cardNumber3));
        }
    }