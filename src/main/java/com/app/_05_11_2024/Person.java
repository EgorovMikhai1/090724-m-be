package com.app._05_11_2024;

import lombok.Getter;

import java.util.Objects;

public class Person {

    @Getter
    private String name;

    private int age;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        byte b = 120;
        b += 356 + 256 + 256 ;

        System.out.println(b);
    }
}