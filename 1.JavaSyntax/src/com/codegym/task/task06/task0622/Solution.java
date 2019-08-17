package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 5;
        ArrayList<Integer> numList = new ArrayList<Integer>(n);

        for(int i = 0; i < n; i++){
            String str = reader.readLine();
            int num = Integer.parseInt(str);
            numList.add(num);
        }

        Collections.sort(numList);

        for (int num : numList ) {
            System.out.println(num);
        }
    }
}
