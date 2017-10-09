package com.java.lab7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Store s = new Store();
        Scanner input =new Scanner(System.in);
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add Product");
            System.out.println("2. List Product");
            System.out.println("3. Search");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    s.addProduct();
                    break;
                case 2:
                    s.listProduct();
                    break;
                case 3:
                    System.out.print("Search name; ");
                    String name = input.nextLine();
                    s.search(name);
                    break;
                case 4:
                    System.out.println("Bye bye");
                    System.exit(0);
                    break;
            }

        } while(true);

    }
}
