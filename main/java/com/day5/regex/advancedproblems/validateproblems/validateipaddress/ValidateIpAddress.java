package com.day5.regex.advancedproblems.validateproblems.validateipaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateIpAddress {

        // Method to validate an IPv4 address
        public static boolean isValidIPAddress(String ip) {
            // Regular expression to match an IPv4 address
            String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

            // Compile the regular expression
            Pattern pattern = Pattern.compile(regex);

            // Match the input string with the regex
            Matcher matcher = pattern.matcher(ip);

            // Return whether the IP address matches the regex pattern
            return matcher.matches();
        }

        public static void main(String[] args) {
            // Test cases
            String ip1 = "192.168.1.1";
            String ip2 = "255.255.255.255";
            String ip3 = "256.100.50.25";
            String ip4 = "192.168.01.1";  // Invalid because of leading zero in the second octet
            String ip5 = "192.168.1";

            // Print validation results
            System.out.println("IP " + ip1 + " is valid: " + isValidIPAddress(ip1));  // true
            System.out.println("IP " + ip2 + " is valid: " + isValidIPAddress(ip2));  // true
            System.out.println("IP " + ip3 + " is valid: " + isValidIPAddress(ip3));  // false
            System.out.println("IP " + ip4 + " is valid: " + isValidIPAddress(ip4));  // false
            System.out.println("IP " + ip5 + " is valid: " + isValidIPAddress(ip5));  // false
        }
    }