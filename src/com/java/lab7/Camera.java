package com.java.lab7;

import java.util.Scanner;

public class Camera extends Product {

    private boolean hasWifi;

    public Camera() {
    }

    public Camera(int id, String name, double price, int quantity, boolean hasWifi) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    @Override
    public void addNew() {
        super.addNew();
        Scanner input = new Scanner(System.in);
        System.out.print("Wifi (Y/N): ");
        String choice = input.nextLine();
        if (choice.toUpperCase().equals("Y")) {
            this.hasWifi = true;
        } else if (choice.toUpperCase().equals("N")) {
            this.hasWifi = false;
        }
    }
}
