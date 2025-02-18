package com.day5.regex.basicregexproblems.validatealicenseplatenumber;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateALisencePlateNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter License Plate Number");
        String input = sc.nextLine();

        boolean result = validate(input);
        System.out.println(result);

    }

    //Method to validate license number plate

    public static boolean validate(String input){
        String regex = "^[A-Z]{2}\\d{4}$";
        return input.matches(regex);
    }
}
