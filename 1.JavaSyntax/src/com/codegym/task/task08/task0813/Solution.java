package com.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 words that start with the letter "L"

*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> aSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            String lWord = "Lword0" + i;
            aSet.add(lWord);
        }

        return aSet;
    }

    public static void main(String[] args) {
//        System.out.println(createSet());
    }
}
