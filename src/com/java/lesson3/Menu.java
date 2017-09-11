/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson3;

import java.util.Scanner;

/**
 *
 * @author NghiemMinhHoang
 */
public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("****MENU****");
            System.out.println("------------");
            System.out.println("1. ADD");
            System.out.println("2. SUB");
            System.out.println("3. DIV");
            System.out.println("4. MUL");
            System.out.println("5. EXIT");
            System.out.print("CHOICE: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ADD");
                    break;
                case 2:
                    System.out.println("SUB");
                    break;
                case 3:
                    System.out.println("DIV");
                    break;
                case 4:
                    System.out.println("MUL");
                    break;
                case 5:
                    System.out.println("Byebye");
                    break;
                default:
                    System.out.println("INVALID!!!");
            }
        } while (choice != 5);
    }

}
