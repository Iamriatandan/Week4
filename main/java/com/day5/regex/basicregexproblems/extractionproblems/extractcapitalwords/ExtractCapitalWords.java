package com.day5.regex.basicregexproblems.extractionproblems.extractcapitalwords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        List<String > capitalWords = extractedCapitalWords(text);

        for (String word: capitalWords) {
            System.out.println("Capital word : " + word);
        }
    }

    //Method to extract Capital words and store it in a list
    public static List<String> extractedCapitalWords(String text){
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String >words = new ArrayList<>();

        while (matcher.find()){
            words.add(matcher.group());
        }
        return words;
    }
}
