package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());          // Reads the input from console.
        int N = num > 0 ? num : 0;                              // Checks if the input is greater than 0 and sets the number of times our loop will run;

        int maximum = 0;                                        // initializes `maximum` variable to 0 (so zero is returned by default).


        for (int i = 0; i < N; i++){
            int testNum = Integer.parseInt(reader.readLine());

            if (i == 0){
                maximum = testNum;
            }

            if (testNum > maximum){
                maximum = testNum;
            }
        }

        System.out.println(maximum);

    }
}
