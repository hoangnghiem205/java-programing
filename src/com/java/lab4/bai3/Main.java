package com.java.lab4.bai3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("TINH TONG 2 MA TRAN VUONG CAP 2");
        System.out.print("So chieu ma tran size = ");
        int size = input.nextInt();

        int[][] arrA = new int[size][size];
        int[][] arrB = new int[size][size];

        System.out.println("----NHAP MA TRAN A----");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("A[%d,%d] = ", i, j);
                arrA[i][j] = input.nextInt();
            }
        }

        System.out.println("----NHAP MA TRAN B----");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("B[%d,%d] = ", i, j);
                arrB[i][j] = input.nextInt();
            }
        }

        System.out.println("TONG 2 MA TRAN");
        int[][] sum = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = arrA[i][j] + arrB[i][j];
                System.out.printf("%d ",sum[i][j]);
            }
            System.out.println();
        }
    }

}
