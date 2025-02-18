package com.day5.junit.basicproblems.stringutilitymethod;
import static org.junit.jupiter.api.Assertions.*;

import com.day5.junit.basicproblems.stringutilitymethods.StringUtilityMethod;
import org.junit.jupiter.api.Test;

public class StringUtiltyMethodTest {
        private final StringUtilityMethod stringUtils = new StringUtilityMethod();

        @Test
        public void testReverse() {
            assertEquals("gnitset", stringUtils.reverse("testing"));
        }

        @Test
        public void testIsPalindrome() {
            assertTrue(stringUtils.isPalindrome("madam"));
            assertFalse(stringUtils.isPalindrome("hello"));
        }

        @Test
        public void testToUpperCase() {
            assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        }
}
