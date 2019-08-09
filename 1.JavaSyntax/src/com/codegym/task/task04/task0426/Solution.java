package com.codegym.task.task04.task0426;

/* 
Labels and numbers
//- "Negative even number" - if the number is negative and even,
//- "Negative odd number" - if the number is negative and odd,
//- "Zero" - if the number is 0,
//- "Positive even number" - if the number is positive and even,
//- "Positive odd number" - if the number is positive and odd.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sInt = reader.readLine();
        int i = Integer.parseInt(sInt);

        if (i == 0) {
            System.out.println("Zero");
        } else if (i > 0 && i % 2 == 0) {
            System.out.println("Positive even number");
        } else if (i > 0 && i % 2 == 1) {
            System.out.println("Positive odd number");
        } else if (i < 0 && i % 2 == 0) {
            System.out.println("Negative even number");
        } else if (i < 0 && i % 2 == -1) {
            System.out.println("Negative odd number");
        }

    }
}
