package com.day5.regex.advancedproblems.validateproblems.creditcardnumber;

import com.day5.regex.advancedproblems.validateproblems.creditcardnumber.CreditCardNumber;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardNumberTest {
    @BeforeEach
    void setUp(){
        System.out.println("Test Started");
    }
    @AfterEach
    void cleanUp(){
        System.out.println("Test executed successfully");
    }

    @Test
    void testValidCreditCard() {
        assertTrue(CreditCardNumber.isValidCreditCard("4123456789012345"));
        assertTrue(CreditCardNumber.isValidCreditCard("5123456789012345"));
    }

    @Test
    void testInvalidCreditCard() {
        assertFalse(CreditCardNumber.isValidCreditCard("6123456789012345"));
    }
}
