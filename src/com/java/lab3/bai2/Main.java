/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lab3.bai2;

import java.util.Scanner;

/**
 *
 * @author sev_user
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("TINH GIAI THUA");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = input.nextInt();
        
//        if (n < 0) {
//            System.out.println("Khong tinh duoc");
//            System.exit(0); //Ngat chuong trinh
//        }
        
        if (n < 0) {
            System.out.println("Khong tinh duoc");
        } else {
            int gt = 1;
            for (int i = 1; i <= n; i++) {
                gt = gt * i;
            }
            System.out.printf("Giai thua cua %d = %d \n", n, gt);
        }
    }
}
