package com.day6.reflection.intermediateproblems.dynamicmethodinvocaton;
import java.lang.reflect.*;
import java.util.*;
public class DyanamicMethodInvocations {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Get user input for method name
        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = scanner.nextLine();

        // Get user input for numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Load class and create an instance
        MathOperations mathOps = new MathOperations();
        Class<?> clazz = mathOps.getClass();

        // Get method dynamically and invoke it
        Method method = clazz.getMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(mathOps, num1, num2);

        // Display result
        System.out.println("Result: " + result);
    }
}
