package com.day6.reflection.basicproblems.dynamicobjectcreation;

public class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}
