package com.day5.regex.advancedproblems.validateproblems.currencyvalues;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class CurrencyValuesTest {
        @Test
        void testExtractCurrencies() {
            String text = "The price is $45.99, and the discount is 10.50.";
            List<String> expectedCurrencies = List.of("$45.99", "10.50");

            assertEquals(expectedCurrencies, CurrencyValues.extractCurrencies(text));
        }
    }