/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.lesson4;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author sev_user
 */
public class Main {

    public static void main(String[] args) {

        // Khia bao mang
//        int[] studentScores = new int[5];
//        studentScores[0] = 56;
//        studentScores[1] = 5;
//        studentScores[2] = 6;
//        studentScores[3] = 12;
//        studentScores[4] = 43;
//        
//        System.out.println("0 = " + studentScores[0]);
        // Khai bao va gan gia tri
//        int[] studentScores = {56, 5 ,6, 12, 43, 44, 66};
//        
//        System.out.println("Size = " + studentScores.length);
//        System.out.println("0 = " + studentScores[0]);
//        float[] itemPrice = new float[3];
//        Scanner input = new Scanner(System.in);
//        float total = 0f;
//        for (int i = 0; i < itemPrice.length; i++) {
//            System.out.print("Nhap ");
//            itemPrice[i] = input.nextFloat();
//            total += itemPrice[i];
//        }
//        System.out.println("Sum = " + total);
        int[][] matrix = new int[3][3];

//        int[][] matrix = {  {1,2,3},
//                            {2,3,4},
//                            {4,5,6} };
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("M[%d,%d] = ",i,j);
//                matrix[i][j] = input.nextInt();
//            }
//        }
//        // In ra man hinh ma tran 2 chieu
//        System.out.println("-----MA TRAN------");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.printf("%d ",matrix[i][j]);
//            }
//            System.out.println("");
//        }
//        String str = "Hello world!!!";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter str: ");
        String str = input.nextLine();
//        StringBuilder builder = new StringBuilder(str);
//        System.out.println(builder.reverse().toString());
//        System.out.println("str = " + str);
//        
//        // Chieu dai cua String
//        System.out.println("str lengt = " + str.length());
//        System.out.println("str[3] = " + str.charAt(3));
//        System.out.println("concat = " + str.concat(" ABC"));
//        System.out.println("dung + : " + str + " DEF");
//        if (str.compareTo("A") != 0) {
//            System.out.println("Không phải A");
//        } else {
//            System.out.println("NHAP A");
//        }
        String[] split = str.split(" ");
        for (String item : split) {
            System.out.println(item);
        }
        System.out.println("---------------");
        
        StringTokenizer tokenizer = new StringTokenizer(str);
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
