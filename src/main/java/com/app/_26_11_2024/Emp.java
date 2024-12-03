package com.app._26_11_2024;

import java.util.Arrays;
import java.util.Collection;

public class Emp<T> {
    String name;
    int age;

    public void get(Collection<?> collection) {
        System.out.println();
    }

    public static void main(String[] args) {
        new Emp<String>().get(Arrays.asList(1));
    }
}
