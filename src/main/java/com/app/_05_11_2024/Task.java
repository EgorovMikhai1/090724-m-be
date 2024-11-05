package com.app._05_11_2024;

import com.github.javafaker.Faker;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Task {
    /**
     * Person
     *      id
     *      name
     *      surname
     *      age
     *      sex
     *      email
     *
     *      Address address
     *
     * Address address
     *      id
     *      street
     *      int houseNumber
     *      postCode
     *
     * DataBase
     *      static TreeSet
     *      static LinkedList
     *
     *
     * 1 = method List<Person> generatePerson 40()
     * 2 = TreeSet = name, surname, age, Address
     * 3 = LinkedList age > param
     */


}

@ToString
class Person1 {
    String name;
    String surName;

    public Person1(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Person1() {
    }

    public List<Person1> gen() {
        List<Person1> l = new ArrayList<>();
        Faker faker = new Faker();

        for (int i = 0; i < 5; i++) {
            l.add(new Person1(faker.name().firstName(), faker.name().lastName()));
        }

        System.out.println(l);

        return l;
    }

    public static void main(String[] args) {
        new Person1().gen();
    }

}
