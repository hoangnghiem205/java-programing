package com.java.lab4.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky:");
        String str = input.nextLine();

        //Loại bỏ khoảng trắng thừa ở đầu và cuối
        str = str.trim();

        //chia nhỏ chuỗi thành mảng các từ phần tách nhau bởi dấu cách
        String[] tokens = str.split(" ");
        System.out.println("So tu: " + tokens.length);
        for (String tok : tokens) {
            System.out.println(" - " + tok);
        }
    }
}
