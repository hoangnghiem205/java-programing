package com.java.lab6;

public class Student {

    private String name;
    private String email;
    private int age;

    public Student() { //mac dinh
        this.name = "";
        this.email = "";
        this.age = 0;
    }

    public Student(String name, String email, int age) { // day du tham so
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
