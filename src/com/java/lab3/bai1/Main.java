/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lab3.bai1;

import java.util.Scanner;

/**
 *
 * @author sev_user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("GIAI PHUONG TRINH BAC 2");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a ");
        double a = input.nextDouble();
        System.out.print("Nhap b ");
        double b = input.nextDouble();
        System.out.print("Nhap c ");
        double c = input.nextDouble();
        
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x = -b / (2*a);
            System.out.printf("Phuong trinh co nghiem kep x = %.2f \n",x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("Phuong trinh co nghiem x1 = %.2f, x2 = %.2f \n",x1,x2);
        }          
    }
    
}
