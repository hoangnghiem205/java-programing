package com.java.lesson9;

import java.io.IOException;

public class Calculator {

    public double div(double no1, double no2) throws ArithmeticException, IOException {
        if (no2 == 0) throw new ArithmeticException("Loi chia cho 0");
        return no1 / no2;
    }

    public double sqrt(double num) throws MyException {
        if (num < 0) throw new MyException("Khong tinh duoc can cua so am");
        return Math.sqrt(num);
    }
}
