package com.java.lesson8;

public class Student extends Person implements ICar {

    @Override
    public void printInfo() {
        System.out.println("Student: " + this.getName());
    }

    @Override
    public float calculate() {
        return 0;
    }
}
