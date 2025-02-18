package com.day5.regex.basicregexproblem.replaceandmodifystrings;
import com.day5.regex.basicregexproblems.replaceandmodifystrings.replacemultiplespacewithsinglespace.ReplaceMultipleSpaceWithSingleSpace;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class ReplaceSpaceTest {
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

    // Test method to validate the replacement of multiple spaces with a single space
    @Test
    void testReplaceMultipleSpaces() {
        // Input text for testing
        String text = "This   is  an    example    with multiple    spaces.";

        // Expected result after replacing multiple spaces with a single space
        String expectedResult = "This is an example with multiple spaces.";

        // Perform the replacement using the method
        String actualResult = ReplaceMultipleSpaceWithSingleSpace.replaceMultipleSpaces(text);

        // Assert that the result matches the expected output
        assertNotNull(actualResult, "The result should not be null.");
        assertEquals(expectedResult, actualResult, "The result does not match the expected output.");
    }
}
