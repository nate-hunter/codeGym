package com.codegym.task.task05.task0530;

import java.io.*;

/* 
Boss, something weird is happening

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader readerA = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerB = new BufferedReader(new InputStreamReader(System.in));      // this line not necessary - can use reader for both a and b variables.

        int a = Integer.parseInt(readerA.readLine());
        int b = Integer.parseInt(readerB.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
