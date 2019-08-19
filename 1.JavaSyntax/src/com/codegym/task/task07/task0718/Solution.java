package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int n = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++){
            int test = strings.get(i).length();

            if (test < n){
                System.out.println(i);
                break;
            } else if (test > n){
                n = test;
            }
        }

    }
}

