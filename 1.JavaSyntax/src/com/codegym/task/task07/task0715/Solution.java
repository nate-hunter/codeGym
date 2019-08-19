package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Sam");
        strings.add("I");
        strings.add("Am");

        for (int i = 0; i < strings.size(); i++){
            String s = strings.get(i);
            int ind = i + 1;

            if (!(s == "Ham")) {
                strings.add(ind, "Ham");
            }
        }

        for (String s : strings){
            System.out.println(s);
        }
    }
}
