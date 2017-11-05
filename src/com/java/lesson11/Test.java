package com.java.lesson11;


import java.io.File;

public class Test {

    public static void main(String[] args) {

        try {
            File f = new File("data");
            if (f.delete())
                System.out.println("ok");
            else
                System.out.println("err");
//            if (f.mkdir())
//                System.out.println("Ok");
//            else
//                System.out.println("err");

//            File f = new File("data/1.txt");
//            f.createNewFile();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
