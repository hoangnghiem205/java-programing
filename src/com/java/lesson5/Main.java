package com.java.lesson5;

public class Main {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.printInfo();

        stu1.setName("HOANG");
        stu1.setEmail("hoang@gmail.com");
        stu1.setAge(11);


        System.out.println("=================");
        stu1.printInfo();
//        String name = stu1.getName();
//        System.out.println(name);


//        Student stu2 = new Student("Hoang");
//        System.out.println(stu2.name);
//        Student stu3 = new Student("HOANG", "hoangnm@gmail.com");
//        Student[] stu = new Student[10];
    }

}
