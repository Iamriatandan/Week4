package com.day5.junit.advancedproblems.passwordstrengthvalidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordStrengthValidatorTest {

    @Test
    public void testValidPassword() {
        PasswordStrengthValidator validator = new PasswordStrengthValidator();
        assertTrue(validator.isValid("Password1"));
    }

    @Test
    public void testInvalidPasswordTooShort() {
        PasswordStrengthValidator validator = new PasswordStrengthValidator();
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    public void testInvalidPasswordNoUppercase() {
        PasswordStrengthValidator validator = new PasswordStrengthValidator();
        assertFalse(validator.isValid("password1"));
    }

    @Test
    public void testInvalidPasswordNoDigit() {
        PasswordStrengthValidator validator = new PasswordStrengthValidator();
        assertFalse(validator.isValid("Password"));
    }
}
