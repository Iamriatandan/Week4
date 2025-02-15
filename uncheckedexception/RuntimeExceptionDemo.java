package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator and denominator");
        System.out.println("---------------");
        System.out.println("Numerator : ");
       int numerator = sc.nextInt();
        System.out.println("Denominator : ");
       int denominator = sc.nextInt();

       runtimeException(numerator,denominator);
    }

    //Method to check runtime exception
    public static void runtimeException( int numerator,int denominator ){
        try{
           int division =  numerator/denominator; //if denominator is 0 , exception
            System.out.println("Numerator : " + numerator + " Divided by Denominator : " + denominator + " is " + division);
        }
        catch (ArithmeticException e){
            System.out.println("Numerator cannot be divided by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Enter numeric value");
        }

    }
}