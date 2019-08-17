package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int sum = 0;

        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();

            if (s.equals("sum")){
                System.out.println(sum);
                break;
            } else {
                int i = Integer.parseInt(s);
                sum += i;
            }
        }
    }
}
