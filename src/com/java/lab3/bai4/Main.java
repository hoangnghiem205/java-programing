/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lab3.bai4;

import java.util.Scanner;

/**
 *
 * @author sev_user
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int max = 0;
        do {
            System.out.print("Nhap n: ");
            n = input.nextInt();
            if (n > max) {
                max = n;
            }
        } while (n != 0);
        System.out.println("So lon nhat = " + max);
    
    }

}
