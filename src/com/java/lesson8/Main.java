package com.java.lesson8;

public class Main {


    public static void main(String[] args) {

        // Su dung abstract
        Student s = new Student();
        s.setName("HOANG");
        s.printInfo();

        // Su dung interface
//        IShape shape = new IShape();
//        IShape square = new Square(5f);
//        System.out.println(square.calculateArea());
//
//        IShape rec = new Rectangle(5f, 6f);
//        System.out.println(rec.calculateArea());

        Calculate cal = null; //= new Calculate();

//        System.out.println(cal.calArea(new Square(5f)));
//
//        System.out.println(cal.calArea(new Rectangle(5f, 6f)));

        if (cal instanceof Calculate) {
            System.out.println("DUNG LA CALCULATE");
        } else {
            System.out.println("KHONG DUNG");
        }
    }

}
