package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double total = 0;
        int count = 0;

        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int inpNumber = Integer.parseInt(reader.readLine());

            total += inpNumber;
            count++;

            if(inpNumber == -1){
                System.out.println(((total + 1) / (count - 1)));
                break;
            }
        }

    }
}

