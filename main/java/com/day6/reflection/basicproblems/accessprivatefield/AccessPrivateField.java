package com.day6.reflection.basicproblems.accessprivatefield;
import java.lang.reflect.*;
class Person {
    private int age = 25;
}
    public class AccessPrivateField {
        public static void main(String[] args) throws Exception {
            Person person = new Person();
            Class<?> clazz = person.getClass();

            // Access private field
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true);

            // Retrieve value
            System.out.println("Original Age: " + ageField.get(person));

            // Modify value
            ageField.set(person, 30);
            System.out.println("Modified Age: " + ageField.get(person));
        }
    }