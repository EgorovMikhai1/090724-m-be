package com.app._24_10_2024;

import java.util.Arrays;

public class TaskEx {
    public boolean isContainsDuplicate(int[] array) {// [1, 2, 3, 5 ,4, 1]

        return false;
    }

    public boolean hasDuplicate(int[] array) {

        Arrays.sort(array); //O(n log(n))

        for (int i = 0; i < array.length - 1; i++) { // O(n)
            if (array[i] == array[i + 1]) {
                return true; //O(1)
            }
        }
        return false; // O(1)
    }
}
