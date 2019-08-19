package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }

        strings.remove(2);


        for (int i = strings.size()-1; i >= 0; i--){
            System.out.println(strings.get(i));
        }
//        for (int i = 0; i < strings.size(); i++){
//            int g = strings.size() - 1 - i;
//            System.out.println(g);
//            System.out.println(strings.get(g));
//        }
    }
}


