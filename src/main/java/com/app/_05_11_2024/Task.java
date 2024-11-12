package com.app._05_11_2024;

import com.github.javafaker.Faker;
import lombok.ToString;

import java.util.*;

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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(name, person1.name) && Objects.equals(surName, person1.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
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
       new TreeSet<>(Comparator.comparing((Person1 o) -> o.name));
    }

}
