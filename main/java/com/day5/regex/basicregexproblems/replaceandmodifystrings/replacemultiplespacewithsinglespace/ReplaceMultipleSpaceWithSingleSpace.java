package com.day5.regex.basicregexproblems.replaceandmodifystrings.replacemultiplespacewithsinglespace;

public class ReplaceMultipleSpaceWithSingleSpace {
        // Method to replace multiple spaces with a single space
        public static String replaceMultipleSpaces(String text) {
            // Replace multiple spaces with a single space and trim leading/trailing spaces
            return text.replaceAll("\\s+", " ").trim();
        }

        public static void main(String[] args) {
            // Input text with multiple spaces
            String text = "This   is  an    example    with multiple    spaces.";

            // Replace multiple spaces with a single space using the method
            String result = replaceMultipleSpaces(text);

            // Print the result
            System.out.println("Result: " + result);
        }
    }
