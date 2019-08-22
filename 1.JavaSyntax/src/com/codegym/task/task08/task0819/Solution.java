package com.codegym.task.task08.task0819;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        int i = 0;
        for ( Cat cat : cats ){
            System.out.println(i + " - " + (cats.size()-1));
            if(i == cats.size()-1) {
                cats.remove(cat);
            }
            i++;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> cats = new HashSet<>();

        for (int i = 0; i < 3; i++){
            cats.add(new Cat());
        }

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for ( Cat cat : cats ){
            System.out.println(cat);
        }
    }

    // step 1
    public static class Cat {

    }
}
