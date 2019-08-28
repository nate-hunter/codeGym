package com.codegym.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
List of number arrays

    lengths are 5, 2, 4, 7, and 0
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();

        int[] five = {1,2,3,4,5};
        int[] two = {1,2};
        int[] four = {1,2,3,4};
        int[] seven = {1,2,3,4,5,6,7};
        int[] zero = {};

        list.add(five);
        list.add(two);
        list.add(four);
        list.add(seven);
        list.add(zero);


        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
