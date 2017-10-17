package com.java.lesson8.com.java.lesson8.demo;

public class Employee extends Person {

    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDetail() {
//        String.valueOf(this.salary);

        return this.salary + "";
    }
}
