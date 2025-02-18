package com.day5.regex.basicregexproblems.validateausername;
import java.util.regex.*;
import java.util.*;
public class ValidateAUsername {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Enter the String by user
        System.out.println("Enter String");
        String input = sc.next();

        String answer= check(input);
        System.out.println(answer);

    }

    public static String check(String input) {
        //Giving regex pattern
        String output = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        //Making pattern class object and matcher class
        Pattern pattern = Pattern.compile(output);
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            return "Valid";
        }
        else{
            return "Invalid";
        }

    }
}
