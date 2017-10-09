package com.java.lab7;

import java.util.Scanner;

public class SmartPhone extends Product {

    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(int id, String name, double price,
                      int quantity, boolean hasCamera, int sim) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    @Override
    public void addNew() {
        Scanner input =new Scanner(System.in);
        super.addNew();
        System.out.print("Camera (Y/N): ");
        String choice = input.nextLine();
        if (choice.toUpperCase().equals("Y")) {
            this.hasCamera = true;
        } else if (choice.toUpperCase().equals("N")){
            this.hasCamera = false;
        }
        System.out.print("Sim: ");
        this.sim = Integer.parseInt(input.nextLine());
    }
}
