package com.java.lesson8.com.java.lesson8.demo;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Employee();
        p1.setName("HOANG");

        Manager p2 = new Manager(new Employee());

        System.out.println(p1.getDetail());

        System.out.println(p2.getDetail());

    }
}
