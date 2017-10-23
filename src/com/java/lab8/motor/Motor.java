package lab8.motor;

import java.util.Scanner;

public class Motor implements IMotor {

    private String code;
    private String name;
    private double capacity;
    private int num;

    public Motor() {
    }

    public Motor(String code, String name, double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void inputInfor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Code: ");
        this.code = input.nextLine();

        System.out.print("Name: ");
        this.name = input.nextLine();

        System.out.print("Capacity: ");
        this.capacity = Double.parseDouble(input.nextLine());

        System.out.print("Num: ");
        this.num = Integer.parseInt(input.nextLine());

    }

    @Override
    public void displayInfor() {
        System.out.println("=====INFO=====");
        System.out.println("Code: " + this.code);
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Num: " + this.num);
    }

    @Override
    public void changeInfor() {
        Scanner input = new Scanner(System.in);

        System.out.print("Code: ");
        this.code = input.nextLine();

        System.out.print("Name: ");
        this.name = input.nextLine();

        System.out.print("Capacity: ");
        this.capacity = Double.parseDouble(input.nextLine());

        System.out.print("Num: ");
        this.num = Integer.parseInt(input.nextLine());
    }
}
