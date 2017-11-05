package com.java.lesson11;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private double math;

    public Student() {
    }

    public Student(String name, double math) {
        this.name = name;
        this.math = math;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return this.name  + "; " + this.math;
    }
}
