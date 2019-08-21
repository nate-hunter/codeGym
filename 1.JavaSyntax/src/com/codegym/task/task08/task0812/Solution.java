package com.codegym.task.task08.task0812;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Longest sequence
    2, 4, 4, 4, 8, 8, 4, 12, 12, 14
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> ints = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = 10;

        for (int i = 0; i < N; i++){
            String s = reader.readLine();
            ints.add(Integer.parseInt(s));
        }

        ArrayList<Integer> seq = new ArrayList<>();


        int match = 1;
        for (int i = 0; i < ints.size()-1; i++){
            int j = i + 1;

//            if(ints.get(i) == ints.get(j)){
            if(ints.get(i).compareTo(ints.get(j)) == 0){
                match += 1;
                if (j == 9){
                    seq.add(match);
                }

            } else {
                seq.add(match);
//                System.out.println("SEQUENCE @ i=" + i + ": " + seq);
                match = 1;
            }

//            System.out.println("I: [" + i + "] // " + ints.get(i));
//            System.out.println("J: [" + j + "] -- " + ints.get(j) + "    MATCH: " + match);
//            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

        seq.sort(Comparator.comparingInt(Integer::intValue).reversed());
//        System.out.println("SEQUENCE: " + seq);
//        System.out.println("MOST MATCHED SEQUENCE AMT: " + seq.get(0));
        System.out.println(seq.get(0));

    }
}


