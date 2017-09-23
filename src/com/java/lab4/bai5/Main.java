package com.java.lab4.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi 1.");
        String str1 = input.nextLine();

        System.out.println("Nhap chuoi 2.");
        String str2 = input.nextLine();

        if (str1.indexOf(str2) < 0) {
            System.out.println("Khong tim thay \"" + str2 + "\" ben trong \"" + str1 + "\"");
        } else {
            System.out.println("Tim thay o vi tri " + str1.indexOf(str2));
        }
    }
}
