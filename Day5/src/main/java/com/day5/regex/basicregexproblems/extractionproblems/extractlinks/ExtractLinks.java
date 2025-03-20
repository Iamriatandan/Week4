package com.day5.regex.basicregexproblems.extractionproblems.extractlinks;
import java.util.*;
import java.util.regex.*;
public class ExtractLinks {
        public static void main(String[] args) {
            // Input text containing links
            String text = "Visit https://www.google.com and http://example.org for more info.";

            // Extract links using the method
            List<String> links = extractLinks(text);

            // Print the extracted links
            System.out.println("Extracted Links: " + String.join(", ", links));
        }

        // Method to extract links from the text
        public static List<String> extractLinks(String text) {
            // Define the regular expression to match links (URLs)
            String regex = "\\bhttps?://[\\w.-]+(?:\\.[a-zA-Z]{2,})+(?:/[\\w./?&=%-]*)?\\b";

            // List to store extracted links
            List<String> links = new ArrayList<>();

            // Compile the regex pattern and create a matcher
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            // Find and collect all link matches
            while (matcher.find()) {
                links.add(matcher.group());
            }

            return links;
        }
    }


