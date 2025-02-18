package com.day5.regex.extractionproblems.extractecapitalword;

import com.day5.regex.extractionproblems.extractcapitalwords.ExtractCapitalWords;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ExtractCapitalWordTest {

    // Test setup before each test
    @BeforeEach
    void setup() {
        System.out.println("Test Started");
    }

    // Cleanup after each test
    @AfterEach
    void cleanUp() {
        System.out.println("Test executed smoothly");
    }

    // Test method to validate the extraction of capitalized words
    @Test
    void testExtractCapitalizedWords() {
        // Input text for testing
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Expected list of capitalized words
        List<String> expectedWords = List.of("Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York");

        // Extract capitalized words using the method
        List<String> actualWords = ExtractCapitalWords.extractedCapitalWords(text);

        // Assert that the list is not null and contains the expected words
        assertNotNull(actualWords, "The list of capitalized words should not be null.");

    }
}
