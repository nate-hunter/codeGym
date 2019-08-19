package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < M; i++){
            int last = strings.size() - 1;

            String s = strings.remove(0);
            strings.add(last, s);
        }

        for ( String s : strings ) {
            System.out.println(s);
        }


    }
}
