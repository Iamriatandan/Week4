package com.day5.regex.advancedproblems.validateproblems.findrepeatingword;
import com.day5.regex.advancedproblems.validateproblems.findrepeatingwords.FindRepeatingWords;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class FindRepeatingWordsTest {

        @Test
        void testFindRepeatingWords() {
            String sentence = "This is is a repeated repeated word test.";
            List<String> expectedWords = List.of("is", "repeated");

            assertEquals(expectedWords, FindRepeatingWords.findRepeatingWords(sentence));
        }
    }