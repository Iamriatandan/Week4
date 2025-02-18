package com.day5.junit.advancedproblems.userregistration;
public class UserRegistration {

    public void registerUser(String username, String email, String password) {
        if (username == null || email == null || password == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
    }
}

