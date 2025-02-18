package com.day5.regex.extractionproblems.extractdates;
import java.util.*;
import java.util.regex.*;

public class ExtractDates {
        public static void main(String[] args) {
            // Input text containing dates
            String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

            // Extract dates using the method
            List<String> dates = extractDates(text);

            // Print the extracted dates
            System.out.println("Extracted Dates: " + String.join(", ", dates));
        }

        // Method to extract dates in dd/mm/yyyy format
        public static List<String> extractDates(String text) {
            // Define the regular expression to match dates in dd/mm/yyyy format
            String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

            // List to store extracted dates
            List<String> dates = new ArrayList<>();

            // Compile the regex pattern and create a matcher
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            // Find and collect all date matches
            while (matcher.find()) {
                dates.add(matcher.group());
            }

            return dates;
        }
    }
