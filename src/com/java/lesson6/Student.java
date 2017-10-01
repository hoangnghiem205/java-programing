package com.java.lesson6;

public class Student {

    private String name;
    private String email;
    private int age;

    Student() {

    }

    Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("----THONG TIN----");
        System.out.println("ten: " + name);
        System.out.println("email: " + email);
        System.out.println("tuoi: " + age);
    }

    public void printInfo(String name) {
        System.out.println("----THONG TIN----");
        System.out.println("ten: " + this.name);
    }

    public void printInfo(int age) {
        System.out.println("----THONG TIN----");
        System.out.println("tuoi: " + age);
    }

    public void printInfo(String name, String email) {
        System.out.println("----THONG TIN----");
        System.out.println("ten: " + name);
        System.out.println("email: " + email);
    }

}
