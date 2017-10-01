package com.java.demo;

class Student {
    public static int age;
    public static String name;

    public static void printInfo() {
        System.out.println("ten: " + name);
        System.out.println("tuoi: " + age);
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }
}
