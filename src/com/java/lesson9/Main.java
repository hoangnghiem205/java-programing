package com.java.lesson9;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Calculator cal = new Calculator();
        try {
            double kq = cal.sqrt(121);
            System.out.println(kq);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("CH.TRINH KET THUC");

//        File f = new File("f.txt");
//        try {
//            f.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Calculator cal = new Calculator();
//
//        try {
//            double kq = cal.div(56, 10);
//            System.out.println(kq);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }







//        double div = 0;
//        Scanner input = new Scanner(System.in);
//        do {
//            try {
//                System.out.print("a = ");
//                int a = Integer.parseInt(input.nextLine());
//
//                System.out.print("b = ");
//                int b = Integer.parseInt(input.nextLine());
//
//                div = a / b;
//            } catch (NumberFormatException ex) {
//                System.out.println("Nhap sai format");
//                continue;
//            } catch (ArithmeticException ex) {
//                System.out.println("Khong chia duoc cho 0");
//                continue;
//            } finally {
//                System.out.println("a / b = " + div);
//            }
//            break;
//        } while (true);


    }
}
