package com.app._12_11_2024;

public class FunInterExample {

    public static void main(String[] args) {
        new FunInterExample().get(() -> System.out.println("!!!!"));

        new FunInterExample().get(FunInterExample::dodo);
    }

    public void get(FunInterface funInterface) {
        System.out.println("*****");
        funInterface.fun();
    }

    public static void dodo() {
        System.out.println("*****");
        System.out.println("(((((((");
    }
}

@FunctionalInterface
interface FunInterface {
    void fun();
}