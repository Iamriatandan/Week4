package com.day5.regex.basicregexproblem.validateusername;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.day5.regex.basicregexproblems.validateausername.*;
public class ValidateAUsernameTest {
    @Test
    public void testValidInput() {
        assertEquals("Valid", ValidateAUsername.check("user_123"));
    }

    @Test
    public void testInValidInputStartsWithNumber() {
        assertEquals("Invalid", ValidateAUsername.check("123user123"));
    }

    @Test
    public void tooShort() {
        assertEquals("Invalid", ValidateAUsername.check("us"));
    }

    @Test
    public void testTooLongUsername() {
        assertEquals("Invalid", ValidateAUsername.check("this_username_is_too_long"));
    }

    // Test for an empty username
    @Test
    public void testEmptyUsername() {
        assertEquals("Invalid", ValidateAUsername.check(""));
    }

    // Test for a username containing special characters
    @Test
    public void testUsernameWithSpecialCharacters() {
        assertEquals("Invalid", ValidateAUsername.check("user@123"));
    }

    // Test for a username with only numbers
    @Test
    public void testUsernameWithOnlyNumbers() {
        assertEquals("Invalid", ValidateAUsername.check("123456"));
    }

    // Test for a valid username with an underscore
    @Test
    public void testValidUsernameWithUnderscore() {
        assertEquals("Valid", ValidateAUsername.check("user_name123"));
    }

    // Test for a valid username with exactly 15 characters
    @Test
    public void testValidUsernameWithMaxLength() {
        assertEquals("Valid", ValidateAUsername.check("valid_user_123"));
    }

    // Test for an invalid username with an underscore at the start
    @Test
    public void testInvalidUsernameWithUnderscoreAtStart() {
        assertEquals("Invalid", ValidateAUsername.check("_user123"));
    }
}
