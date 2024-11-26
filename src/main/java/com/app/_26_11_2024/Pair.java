package com.app._26_11_2024;

public class Pair<T1,T2> {
    private T1 t1;
    private T2 t2;

    public Pair() {
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

class Empl {
    String name;
    String address;
    String phone;

    public Empl() {
    }
}

class Cat {
    String name;
    int age;

    public static void main(String[] args) {
        Pair<Empl, Cat> pair = new Pair<>();

        pair.setT1(new Empl());

    }
}