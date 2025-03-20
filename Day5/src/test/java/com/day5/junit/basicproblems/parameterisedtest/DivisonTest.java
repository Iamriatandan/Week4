package com.day5.junit.basicproblems.parameterisedtest;
import static org.junit.jupiter.api.Assertions.*;

import com.day5.junit.basicproblems.parametrizedtest.Division;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DivisonTest {
    private final Division value = new Division();

    // Test the isEven method with multiple values
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6}) // Even numbers
    public void testIsEvenWithEvenNumbers(int number) {
        // Assert that the result should be true for even numbers
        assertTrue(Division.isEven(number), "Expected " + number + " to be even");
    }

    // Test the isEven method with odd numbers
    @ParameterizedTest
    @ValueSource(ints = {7, 9}) // Odd numbers
    public void testIsEvenWithOddNumbers(int number) {
        // Assert that the result should be false for odd numbers
        assertFalse(Division.isEven(number), "Expected " + number + " to be odd");
    }
}
