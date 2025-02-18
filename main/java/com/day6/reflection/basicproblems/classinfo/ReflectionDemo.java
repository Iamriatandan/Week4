package com.day6.reflection.basicproblems.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // Accept class name as input
        String className = "java.util.ArrayList";  // Example class
        Class<?> clazz = Class.forName(className);

        // Display class name
        System.out.println("Class: " + clazz.getName());

        // Display constructors
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        // Display methods
        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        // Display fields
        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }
    }
}
