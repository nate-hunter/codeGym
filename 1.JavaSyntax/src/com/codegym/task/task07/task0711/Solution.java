package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            strings.add(s);
        }

        for(int j = 0; j < 13; j++){
            int index = strings.size()-1;
            String last = strings.remove(index);
            strings.add(0, last);
        }

        for( String s : strings ) {
            System.out.println(s);
        }

    }
}
