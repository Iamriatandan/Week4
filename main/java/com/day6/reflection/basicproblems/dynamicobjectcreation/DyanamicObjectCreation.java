package com.day6.reflection.basicproblems.dynamicobjectcreation;
import java.lang.reflect.*;
public class DyanamicObjectCreation {
    public static void main(String[] args) throws Exception {
        // Load class dynamically
        Class<?> clazz = Class.forName("Student");

        // Create instance using Reflection
        Object student = clazz.getDeclaredConstructor().newInstance();

        // Invoke method
        Method displayMethod = clazz.getMethod("display");
        displayMethod.invoke(student);
    }
}
