package com.day5.junit.basicproblems.exceptionhandling;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

        private final ExceptionHandling calculator = new ExceptionHandling();

        @Test
        public void testDivideByZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        }
}
