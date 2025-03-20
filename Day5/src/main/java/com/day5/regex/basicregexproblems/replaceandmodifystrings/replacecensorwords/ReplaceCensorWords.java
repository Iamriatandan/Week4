package com.day5.regex.basicregexproblems.replaceandmodifystrings.replacecensorwords;
import java.util.List;
import java.util.ArrayList;

public class ReplaceCensorWords {

        // Method to censor bad words in a sentence
        public static String censorWords(String sentence, List<String> badWords) {
            // Loop through each bad word in the list and replace it with "****"
            for (String word : badWords) {
                sentence = sentence.replaceAll("\\b" + word + "\\b", "****");
            }
            return sentence;
        }

        public static void main(String[] args) {
            // Input sentence
            String text = "This is a damn bad example with some stupid words.";

            // List of bad words to censor
            List<String> badWords = new ArrayList<>();
            badWords.add("damn");
            badWords.add("stupid");

            // Censor the bad words in the sentence
            String result = censorWords(text, badWords);

            // Print the result
            System.out.println("Censored Sentence: " + result);
        }
    }