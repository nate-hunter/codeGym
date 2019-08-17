package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
       String[] strArr = new String[10];

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       for (int i = 0; i < 8; i++){
           strArr[i] = reader.readLine();
       }

       for (int j = 9; j >= 0; j--){
           System.out.println(strArr[j]);
       }

    }
}

/*
public class Solution {
    public static void main(String[] args) throws Exception {
        int n = 8;
        int l = 10;
        String[] strArr = new String[10];

        strArr[l-1] = "the end";
        strArr[l-2] = "close to the end";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; i++){
            String s = reader.readLine();
            strArr[i] = "This is a string " + s;
        }

        for (int i = 9; i >= 0; i--){
            System.out.println(strArr[i]);
        }
    }
}


 */