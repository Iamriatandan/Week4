package com.day5.regex.basicregexproblem.extractionproblems.extractemailaddress;

import com.day5.regex.basicregexproblems.extractionproblems.extractemailaddress.ExtractEmailAddress;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExtractEmailAddressTest {

    // Setup method to run before each test
    @BeforeEach
    void setup() {
        System.out.println("Test Started");
    }

    // Cleanup method to run after each test
    @AfterEach
    void cleanUp() {
        System.out.println("Test executed smoothly");
    }

    // Test method to check email extraction from a string
    @Test
    void testExtractEmails() {
        // Input string containing multiple emails
        String text = "Contact us at support@example.com and info@company.org";

        // Call the method to extract emails
        List<String> emails = ExtractEmailAddress.extractedEmail(text);

        // Verify the number of extracted emails
        assertNotNull(emails, "The list of emails should not be null.");
        assertEquals(2, emails.size(), "There should be 2 emails extracted.");

        // Verify each expected email is present in the list
        assertTrue(emails.contains("support@example.com"), "support@example.com should be extracted.");
        assertTrue(emails.contains("info@company.org"), "info@company.org should be extracted.");
    }
}
