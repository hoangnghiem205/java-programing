/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lab3.bai3;

import java.util.Scanner;

/**
 *
 * @author sev_user
 */
public class Main {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("KIEM TRA SO NGUYEN TO");
        System.out.print("Nhap vao n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        boolean checkPrime = true;
//        for (int i = 2; i < Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                System.out.println(n + " khong phai la so nguyen to");
//                checkPrime = false;
//                break;
//            }
//        }

        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

        System.out.println("------------------");
        System.out.println("10 SO NGUYEN TO DAU TIEN");
        
        int dem = 0;
        int num = 1;
        while (dem < 10) {
            if (isPrime(num)) {
                System.out.println("So thu " + (dem + 1) + " = " + num);
                dem++;
            }
            num++;
        }
    }

}
