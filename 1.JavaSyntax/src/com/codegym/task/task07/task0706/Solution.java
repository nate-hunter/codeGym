package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

    "Odd-numbered houses have more residents." or "Even-numbered houses have more residents."

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] houses = new int[15];

        for (int i = 0; i < houses.length; i++){
            houses[i] = Integer.parseInt(reader.readLine());
        }

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < houses.length; i++){
            if (i == 0 || i % 2 == 0){
                sumEven += houses[i];
            } else if (i % 2 != 0){
                sumOdd += houses[i];
            }
        }

        if (sumOdd > sumEven){
            System.out.println("Odd-numbered houses have more residents.");
        } else if (sumOdd < sumEven){
            System.out.println("Even-numbered houses have more residents.");
        }
    }
}
