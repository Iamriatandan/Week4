package com.day5.regex.basicregexproblem.extractionproblems.extractlink;

import com.day5.regex.basicregexproblems.extractionproblems.extractlinks.ExtractLinks;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ExtractLinkTest {

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

    // Test method to validate the extraction of links
    @Test
    void testExtractLinks() {
        // Input text for testing
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Expected list of extracted links
        List<String> expectedLinks = List.of("https://www.google.com", "http://example.org");

        // Extract links using the method
        List<String> actualLinks = ExtractLinks.extractLinks(text);

        // Assert that the list is not null and contains the expected links
        assertNotNull(actualLinks, "The list of extracted links should not be null.");
        assertEquals(expectedLinks, actualLinks, "The extracted links do not match the expected links.");
    }

    // Additional test case for a sentence with no links
    @Test
    void testNoLinks() {
        // Input text with no links
        String text = "There are no links in this text.";

        // Expected result: an empty list
        List<String> expectedLinks = List.of();

        // Extract links using the method
        List<String> actualLinks = ExtractLinks.extractLinks(text);

        // Assert that the list of links is empty
        assertNotNull(actualLinks, "The list should not be null.");
        assertTrue(actualLinks.isEmpty(), "The list should be empty.");
    }

    // Additional test case for a sentence with a single link
    @Test
    void testSingleLink() {
        // Input text with one link
        String text = "Visit http://example.com for more information.";

        // Expected result

    }
}