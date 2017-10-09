package com.java.lab7;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quanity;

    public Product() {

    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quanity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return this.quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void addNew() {
        System.out.println("========INPUT========");
        Scanner input =new Scanner(System.in);
        System.out.print("Id: ");
        this.id = Integer.parseInt(input.nextLine());

        System.out.print("Name: ");
        this.name = input.nextLine();

        System.out.print("Price: ");
        this.price = Double.parseDouble(input.nextLine());

        System.out.print("Quantity: ");
        this.quanity = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return this.name + " - " + this.price;
    }
}
