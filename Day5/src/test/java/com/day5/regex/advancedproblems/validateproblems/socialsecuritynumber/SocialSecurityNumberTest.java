package com.day5.regex.advancedproblems.validateproblems.socialsecuritynumber;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class SocialSecurityNumberTest {

        @Test
        void testValidSSN() {
            assertTrue(SocalSecurityNumber.isValidSSN("123-45-6789"));
        }

        @Test
        void testInvalidSSN() {
            assertFalse(SocalSecurityNumber.isValidSSN("123456789"));
        }
}
