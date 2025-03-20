package com.day5.regex.basicregexproblems.validationproblems.validhexcolourcode;
import java.util.*;
public class ValidHexCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter HexCode : " );
        String inputCode = sc.nextLine();

        boolean result = validHexCode(inputCode);
        System.out.println(result ? "Valid" : "Invalid");
    }

    //Method to check if hexCode is valid or not Range:
    public static boolean validHexCode(String inputCode){
        String regex = "^#([A-Fa-f0-9]{6})$";
         return inputCode.matches(regex);
    }
}
