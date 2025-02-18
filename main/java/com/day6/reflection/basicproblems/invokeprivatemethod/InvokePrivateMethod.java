package com.day6.reflection.basicproblems.invokeprivatemethod;
import java.lang.reflect.*;
public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Class<?> clazz = calculator.getClass();

        // Access private method
        Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        // Invoke method
        int result = (int) multiplyMethod.invoke(calculator, 5, 3);
        System.out.println("Multiplication Result: " + result);
    }
}
