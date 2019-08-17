package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String st = String.valueOf(ch);
            int tn = Integer.parseInt(st);

            if (tn % 2 == 0){
                even++;
            } else if (tn % 2 != 0){
                odd++;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
