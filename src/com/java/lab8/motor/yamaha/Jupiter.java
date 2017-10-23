package lab8.motor.yamaha;

import motor.Motor;

import java.util.Scanner;

public class Jupiter extends Motor {

    private int warranty;

    public Jupiter() {
    }

    public Jupiter(String code, String name, double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner input = new Scanner(System.in);
        System.out.print("Warranty: ");
        this.warranty = Integer.parseInt(input.nextLine());
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Warranty: " + this.warranty);
    }
}
