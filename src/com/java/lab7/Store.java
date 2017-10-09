package com.java.lab7;

import java.util.Scanner;

public class Store {

    private Product[] products;
    private static final int MAX = 50;
    private int size;

    public Store() {
        products = new Product[MAX];
        size = 0;
    }

    public void addProduct() {
        Scanner input = new Scanner(System.in);
        Product p = null;

        System.out.print("SmartPhone / Camera (S/C):");
        String choice = input.nextLine();
        if (choice.toUpperCase().equals("S")) {
            //Nhap smartphone
            p = new SmartPhone();
        } else if (choice.toUpperCase().equals("C")) {
            //Nhap camera
            p = new Camera();
        }
        p.addNew();
        products[size++] = p;
    }

    public void listProduct() {

        //header
//        +================+=======+=========+
//        | NAME           | PRICE | QUANTIY |
//        +================+=======+=========+

        System.out.println("+================+=======+=========+");
        System.out.println("| NAME           | PRICE | QUANTIY |");
        System.out.println("+================+=======+=========+");

        // row
//        | Ihone X           | 1000 | 100     |
        for (int i = 0; i < size; i++) {
            System.out.printf("| %-15s| %-6s| %-8s|\n", products[i].getName(),
                    products[i].getPrice()+"",
                    products[i].getQuanity()+"");
            System.out.println("+----------------+-------+---------+");
        }
    }

    public void search(String name) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) {
                System.out.println(products[i]);
                found = true;
            }
        }
        if (!found)
            System.out.println("Not found");
    }
}
