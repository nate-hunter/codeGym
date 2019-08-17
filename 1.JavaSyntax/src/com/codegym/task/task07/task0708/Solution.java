package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings  = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            strings.add(s);
        }

        // Sorts by length of each element's string length
        strings.sort(Comparator.comparingInt(String::length));

        ArrayList<String> longestStrings = new ArrayList<>();
        int longest = 0;

        for(int i = strings.size() - 1; i >= 0; i--){
            String s = strings.get(i);
            if(s.length() >= longest){
                longest = s.length();
                longestStrings.add(s);
            }
        }

        for( String s : longestStrings ){
            System.out.println(s);
        }

    }
}


/* Alternative way without creating another array and using a sort method.
public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;

        //add strings to the list,
        for (int i = 0; i < strings.size(); i++) {
            strings.add(reader.readLine());
        }

        //find the longest string
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() > max)
                max = strings.get(i).length();
        }

        // if the string's length equals to max, print it.
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }
    }
}
 */