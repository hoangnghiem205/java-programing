package lab8.motor.yamaha;

import motor.Motor;

import java.util.Scanner;

public class Yamaha {

    public static void main(String[] args) {

        Motor[] motors = new Motor[4];
        Scanner input = new Scanner(System.in);
        do {
            //In menu
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Sort");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int c = Integer.parseInt(input.nextLine());
            switch (c) {
                case 1:

                    for (int i = 0; i < 4; i++) {
                        if (i < 2) {
                            System.out.println("-----JUPITER-----");
                            motors[i] = new Jupiter();
                        } else {
                            System.out.println("-----SERIUS-----");
                            motors[i] = new Serius();
                        }
                        motors[i].inputInfor();

                    }
                    break;
                case 2:
                    System.out.println("========THONG TIN=======");
                    for (int i = 0; i < motors.length; i++) {
                        motors[i].displayInfor();
                    }
                    break;
                case 3:

                    System.out.println("=====SAP XEP======");
                    for (int i = 0; i < motors.length - 1; i++) {
                        for (int j = i + 1; j < motors.length; j++) {
                            int warr1 = motors[i] instanceof Jupiter ?
                                    ((Jupiter) motors[i]).getWarranty() :
                                    ((Serius) motors[i]).getWarranty();
                            int warr2 = motors[j] instanceof Jupiter ?
                                    ((Jupiter) motors[j]).getWarranty() :
                                    ((Serius) motors[j]).getWarranty();
                            if (warr1 > warr2) {
                                Motor motor = motors[i];
                                motors[i] = motors[j];
                                motors[j] = motor;
                            }
                        }
                    }

                    System.out.println("========KET QUA=======");
                    for (int i = 0; i < motors.length; i++) {
                        motors[i].displayInfor();
                    }

                    break;
                case 4:

                    System.out.print("Name: ");
                    String name = input.nextLine();
                    boolean found = false;

                    for (int i = 0; i < motors.length; i++) {
                        if (motors[i].getName().equals(name)) {
                            motors[i].displayInfor();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Not found");
                    }
                    break;
                case 5:
                    System.out.println("Bye bye");
                    System.exit(0);
            }
        } while(true);
    }
}
