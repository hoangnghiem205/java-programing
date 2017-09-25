package com.java.lesson5;

public class Student {

    private String name;
    private String email;
    private int age;

    Student() {
        System.out.println("Init Student");
        name = "anonymous";
        age = 0;
        email = "abc@gmail.com";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    Student(String _name) {
//        System.out.println("Init Student(name="+_name+")");
//        name = _name;
//        age = 0;
//        email = "abc@gmail.com";
//    }
//
//    Student(String _name, String _email) {
//        System.out.println("name="+name+", email="+email);
//        name = _name;
//        email = _email;
//        age = 0;
//    }

    public void printInfo() {
        System.out.println("Student(name="+name+
                ", age="+age+", email="+email+")");
    }



}
