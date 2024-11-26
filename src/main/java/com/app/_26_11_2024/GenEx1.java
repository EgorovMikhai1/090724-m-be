package com.app._26_11_2024;

import com.app._05_11_2024.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.ErrorManager;

public class GenEx1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List list = new ArrayList();

        list.add("a");
        //list.add((String) "a") <? extends T>
    }
}

interface Gen<X extends Person> {
    <T extends Person> List<T> get(T[] array);
    List<Object> getO(Object[] array);
}

interface Star {
    <X extends Person> List<X> getS(Collection<? extends ErrorManager> array);
}