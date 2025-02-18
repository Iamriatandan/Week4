package com.day5.regex.extractionproblems.extractdates;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class ExtractDatesTest {
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

        // Test method to validate the extraction of dates in dd/mm/yyyy format
        @Test
        void testExtractDates() {
            // Input text for testing
            String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

            // Expected list of extracted dates
            List<String> expectedDates = List.of("12/05/2023", "15/08/2024", "29/02/2020");

            // Extract dates using the method
            List<String> actualDates = ExtractDates.extractDates(text);

            // Assert that the list is not null and contains the expected dates
            assertNotNull(actualDates, "The list of extracted dates should not be null.");
            assertEquals(expectedDates, actualDates, "The extracted dates do not match the expected dates.");
        }
    }

