package com.java.lesson7;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("hoang", 12, "ha noi");
        p.printInfo();

        Student stud = new Student();
        stud.setName("HOA");
        stud.setEmail("hoang@gmail.com");
        stud.setAge(12);
        stud.setStudentId("S0001");
        stud.setAddress("Ha noi");

        Student stud2 = new Student();
        stud2.setName("TUNG");
        stud2.setEmail("hoa@gmail.com");
        stud2.setAge(22);
        stud2.setStudentId("S0001");
        stud2.setAddress("Ha noi");

//        if (stud.getStudentId().equals(stud2.getStudentId())) {
        if (stud.equals(stud2)) {
            System.out.println("GIONG NHAU");
        } else {
            System.out.println("KHAC NHAU");
        }

        System.out.println(stud.compareTo(stud2));



    }

}
