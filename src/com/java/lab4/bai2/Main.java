package com.java.lab4.bai2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = input.nextInt();

        //khai báo mảng
        int[] arr = new int[n];

        //khởi tạo giá trị ngẫu nhiên cho mảng
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); // sinh số ngẫu nhiên từ 0 - 99
        }

        //In mang
        System.out.println("MANG BAN DAU");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        //Sắp xếp
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //In mang
        System.out.println("\n\nMANG SAU KHI SAP XEP");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
