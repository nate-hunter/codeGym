package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] lgArr = new int[20];

        for (int i = 0; i < lgArr.length; i++){
            String s = reader.readLine();
            lgArr[i] = Integer.parseInt(s);
        }

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = lgArr[i];
        }

        int j = 0;
        for (int i = 10; i < 20; i++){
                arr2[j] = lgArr[i];
                j++;
        }

        for( int el : arr2 ){
            System.out.println(el);
        }

    }
}
