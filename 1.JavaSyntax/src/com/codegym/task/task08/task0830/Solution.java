package com.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];         // CHANGE BACK TO 20 BEFORE VALIDATION!!!!!!!!!!!!!!!!!!!!!!!!!!S
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //write your code here
        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j < array.length; j++){
                if (isGreaterThan(array[i], array[j])){
                    String copy = array[i];
                    array[i] = array[j];
                    array[j] = copy;
                }
            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
