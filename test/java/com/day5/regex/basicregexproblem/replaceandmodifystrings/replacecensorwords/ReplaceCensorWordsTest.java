package com.day5.regex.basicregexproblem.replaceandmodifystrings.replacecensorwords;
import com.day5.regex.basicregexproblems.replaceandmodifystrings.replacecensorwords.ReplaceCensorWords;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class ReplaceCensorWordsTest {

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

        // Test method to validate the censoring of bad words
        @Test
        void testCensorBadWords() {
            // Input text for testing
            String text = "This is a damn bad example with some stupid words.";

            // List of bad words to censor
            List<String> badWords = new ArrayList<>();
            badWords.add("damn");
            badWords.add("stupid");

            // Expected result after censoring the bad words
            String expectedResult = "This is a **** bad example with some **** words.";

            // Perform the censorship using the method
            String actualResult = ReplaceCensorWords.censorWords(text, badWords);

            // Assert that the result matches the expected output
            assertNotNull(actualResult, "The result should not be null.");
            assertEquals(expectedResult, actualResult, "The result does not match the expected output.");
        }

        // Test method for when no bad words are present
        @Test
        void testNoBadWords() {
            // Input text with no bad words
            String text = "This sentence has no bad words.";

            // List of bad words to censor
            List<String> badWords = new ArrayList<>();
            badWords.add("damn");
            badWords.add("stupid");

            // Expected result after censoring (no change)
            String expectedResult = "This sentence has no bad words.";

            // Perform the censorship using the method
            String actualResult = ReplaceCensorWords.censorWords(text, badWords);

            // Assert that the result matches the expected output
            assertNotNull(actualResult, "The result should not be null.");
            assertEquals(expectedResult, actualResult, "The result does not match the expected output.");
        }

        // Test method for when the bad words are case-sensitive
        @Test
        void testCaseSensitiveBadWords() {
            // Input text with bad words in different cases
            String text = "This is a Damn bad example with some Stupid words.";

            // List of bad words to censor (lowercase by default)
            List<String> badWords = new ArrayList<>();
            badWords.add("damn");
            badWords.add("stupid");

            // Expected result after censoring
            String expectedResult = "This is a **** bad example with some **** words.";

            // Perform the censorship using the method
            String actualResult = ReplaceCensorWords.censorWords(text, badWords);

            // Assert that the result matches the expected output
            assertNotNull(actualResult, "The result should not be null.");
        }
    }