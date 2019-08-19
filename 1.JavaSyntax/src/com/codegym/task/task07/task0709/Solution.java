package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }

        int min = strings.get(0).length();

        for(int i = 1; i < strings.size(); i++){
            int n = strings.get(i).length();

            if(n <= min){
                min = n;
            }
        }

        for(int i = 0; i < strings.size(); i++){
            String s = strings.get(i);
            if (s.length() == min){
                System.out.println(s);
            }
        }
//
//        System.out.println(min);
//
//        System.out.println(strings.toString());
    }
}
