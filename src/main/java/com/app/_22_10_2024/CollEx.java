package com.app._22_10_2024;

import java.util.ArrayList;
import java.util.List;

public class CollEx {

  public void get(C a) {
      System.out.println(a);
  }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
    }
}

class C {

}

class A extends C{

}

class B extends C{

}
