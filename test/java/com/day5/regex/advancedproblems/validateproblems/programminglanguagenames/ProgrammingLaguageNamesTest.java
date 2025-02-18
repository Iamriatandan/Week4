package com.day5.regex.advancedproblems.validateproblems.programminglanguagenames;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class ExtractProgrammingLanguagesTest {

    @Test
    void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> expectedLanguages = List.of("Java", "Python", "JavaScript", "Go");

        assertEquals(expectedLanguages, ProgrammingLanguageNames.extractLanguages(text));
    }
}
