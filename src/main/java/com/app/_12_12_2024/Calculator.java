package com.app._12_12_2024;

public class Calculator {
    public double divide(int a, int b) {
        if(b == 0) {
            throw new DivideByZeroException(ErrorMessage.DIVIDE_BY_ZERO);
        }
        return  a / b;
    }

    public static void main(String[] args) {
        new Calculator().divide(2, 0);
    }
}