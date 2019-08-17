package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] intArr = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < intArr.length; i++){
            String s = reader.readLine();
            intArr[i] = Integer.parseInt(s);
        }

        for(int j = 9; j >= 0; j--){
            System.out.println(intArr[j]);
        }
    }
}

