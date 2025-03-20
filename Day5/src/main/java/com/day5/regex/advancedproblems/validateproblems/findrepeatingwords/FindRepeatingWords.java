package com.day5.regex.advancedproblems.validateproblems.findrepeatingwords;
import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {

    public static List<String> findRepeatingWords(String sentence) {
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        Set<String> repeatingWords = new HashSet<>();
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }
        return new ArrayList<>(repeatingWords);
    }

    public static void main(String[] args) {
        String sentence = "This is is a repeated repeated word test.";
        List<String> repeatingWords = findRepeatingWords(sentence);
        System.out.println(repeatingWords); // Output: [is, repeated]
    }
}
