package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] intArray = new int[20];
        int n = intArray.length;

        for(int i = 0; i < n; i++){
            String s = reader.readLine();
            intArray[i] = Integer.parseInt(s);
        }

        return intArray;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
