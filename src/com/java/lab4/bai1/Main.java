package com.java.lab4.bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        /*
            NHẬP VÀO 1 MẢNG N PHẦN TỬ TỪ BÀN PHÍM
         */
        int[] arr = new int[n];
        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
        }

        /*
            TÍNH TỔNG PHẦN TỬ MẢNG
         */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("TONG CUA DAY = " + sum);

        /*
            TÌM MIN MAX
         */
        int min,max;
        min = max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);

    }

}
