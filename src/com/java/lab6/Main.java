package com.java.lab6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice = 0;
        do {
            System.out.println("---Student Manager---");
            System.out.println("1.  List");
            System.out.println("2.  Search");
            System.out.println("3.  Add");
            System.out.println("4.  Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("A/D/N: ");
                    String order = input.nextLine();
                    if (order.equals("A")) {
                        manager.list(true);
                    } else if (order.equals("D")) {
                        manager.list(false);
                    } else {
                        manager.list();
                    }

                    break;
                case 2:
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    manager.search(name);
                    break;
                case 3:
                    Student stud = new Student();
                    System.out.print("\nName: ");
                    stud.setName(input.nextLine());
                    System.out.print("\nEmail: ");
                    stud.setEmail(input.nextLine());
                    System.out.print("\nAge: ");
                    stud.setAge(Integer.parseInt(input.nextLine()));

                    manager.add(stud);
                    break;
                case 4:
                    System.out.println("bye!!");
                    break;
                default:
                    System.out.println("Not valid!");
            }
        } while(choice != 4);
    }
}
