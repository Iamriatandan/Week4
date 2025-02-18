package com.day5.junit.advancedproblems.userregistration;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void testValidRegistration() {
        UserRegistration registration = new UserRegistration();
        registration.registerUser("user1", "user1@example.com", "password123");
    }

    @Test
    public void testInvalidUsername() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser(null, "user1@example.com", "password123"));
    }

    @Test
    public void testInvalidEmail() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("user1", "invalidemail", "password123"));
    }

    @Test
    public void testInvalidPassword() {
        UserRegistration registration = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("user1", "user1@example.com", "short"));
    }
}
