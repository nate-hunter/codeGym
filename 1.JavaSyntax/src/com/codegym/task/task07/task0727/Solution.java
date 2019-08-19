package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality
    New task: The program takes in strings until the user enters an empty string (by pressing Enter).
    Then the program builds a new list. If a string has an even number of letters, then the string is duplicated.
    If the number of letters is odd, then the string is repeated three times.
    The program displays the contents of the new list.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            int test = s.length();

            if (test % 2 == 0){
                newList.add(s + " " + s);
            } else if (test % 2 != 0) {
                newList.add(s + " " + s + " " + s);
            }
        }

        for ( String s : newList ) {
            System.out.println(s);
        }

//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
//        }
//
//        for (int i = 0; i < listUpperCase.size(); i++) {
//            System.out.println(listUpperCase.get(i));
//        }

    }
}
