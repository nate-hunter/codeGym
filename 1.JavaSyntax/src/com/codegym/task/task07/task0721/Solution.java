package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] houses = new int[20];

        for (int i = 0; i < houses.length; i++){
            houses[i] = Integer.parseInt(reader.readLine());
        }

        maximum = houses[0];
        minimum = houses[0];

        for (int i = 1; i < houses.length; i++){
            int test = houses[i];

            if (test < minimum) {
                minimum = test;
            } else if (test > maximum) {
                maximum = test;
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
