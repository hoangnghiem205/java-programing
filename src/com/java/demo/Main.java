package com.java.demo;

import java.util.Scanner;

public class Main {

    static Scanner input;

    public static void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
    }

    public static void main(String[] args) {

        inputInfo();


//        Main.input = new Scanner(System.in);
        Person p = new Person("HOANG",
                12, "hoang@gmail.com");

        System.out.println(Person.CMND);
//
//        p.getName();
//
//        Student.name = "HOANG";
//        Student.age = 11;
//
//        Student.printInfo();

    }
}
