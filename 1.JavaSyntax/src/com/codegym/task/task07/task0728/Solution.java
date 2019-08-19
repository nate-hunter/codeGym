package com.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
In decreasing order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        // This way may be more time/memory efficient?
//        for (int i = array.length - 1; i >= 0; i--){
//            for (int j = 0; j < i; j++){
//
//                if (array[j] < array[j+1]) {
//                    int copy = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = copy;
//                }
//            }
//        }

        for(int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] < array[j]){
                    int copy = array[j];
                    array[j] = array[i];
                    array[i] = copy;
                }
            }
        }

    }
}
