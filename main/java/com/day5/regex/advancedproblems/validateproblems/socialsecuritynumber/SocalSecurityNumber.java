package com.day5.regex.advancedproblems.validateproblems.socialsecuritynumber;
import java.util.regex.*;

public class SocalSecurityNumber {
        public static boolean isValidSSN(String ssn) {
            String regex = "^(?!000|666|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$";
            return Pattern.matches(regex, ssn);
        }

        public static void main(String[] args) {
            String ssn1 = "123-45-6789";
            String ssn2 = "123456789";

            System.out.println(isValidSSN(ssn1));
            System.out.println(isValidSSN(ssn2));
        }
}
