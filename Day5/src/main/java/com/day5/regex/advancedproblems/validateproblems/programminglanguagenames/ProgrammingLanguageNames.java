package com.day5.regex.advancedproblems.validateproblems.programminglanguagenames;
import java.util.*;
import java.util.regex.*;
public class ProgrammingLanguageNames {


        public static List<String> extractLanguages(String text) {
            String regex = "\\b(Java|Python|JavaScript|Go)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            List<String> languages = new ArrayList<>();
            while (matcher.find()) {
                languages.add(matcher.group());
            }
            return languages;
        }

        public static void main(String[] args) {
            String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
            List<String> languages = extractLanguages(text);
            System.out.println(languages); // Output: [Java, Python, JavaScript, Go]
        }

}
