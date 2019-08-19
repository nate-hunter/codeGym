package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            strings.add(s);
        }

        int shortest = strings.get(0).length();
        int longest = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++){
            int size = strings.get(i).length();
            if(size < shortest){
                shortest = size;
            }

            if(size > longest){
                longest = size;
            }
        }

        for(String s : strings){
            if (s.length() == shortest || s.length() == longest){
                System.out.println(s);
                break;
            }
        }

    }
}
