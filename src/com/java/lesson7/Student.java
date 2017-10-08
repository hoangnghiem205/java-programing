package com.java.lesson7;

public class Student extends Person{

    private String studentId;
    private String email;

    public Student() {
    }

    public Student(String studentId, String email) {
        this.studentId = studentId;
        this.email = email;
    }

    public Student(String name, int age, String address,
                   String studendId, String meail ) {

//        this.setName(name);
//        this.setAge(age);
//        this.setAddress(address);
        super(name, age, address);
        this.studentId =  studendId;
        this.email = email;
    }


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("StudentID " + this.studentId);
    }

    @Override
    public String toString() {
        return this.getStudentId() + "-" + this.getName() + "-" + this.getEmail();
    }

    @Override
    public boolean equals(Object o) {
        Student stud = (Student) o;
        return this.studentId.equals(stud.getStudentId())
                && this.getName().equals(stud.getName());
    }

    public int compareTo(Object o) {
        Student stud = (Student) o;
        return this.getName().compareTo(stud.getName());
    }

}
