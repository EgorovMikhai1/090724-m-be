package com.app._12_11_2024;

import java.util.LinkedList;
import java.util.List;

public class Fie3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(17);
        list.add(1);
        list.add(2);

        list.stream()
                .filter(el -> el % 2 == 0)
                .distinct()
                .map(el -> el + "")
                .forEach(el -> System.out.println(el));
    }
}