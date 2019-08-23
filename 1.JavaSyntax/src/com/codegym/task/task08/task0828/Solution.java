package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

    - The program reads the name of the month from the keyboard and then displays its number on the screen in a phrase like:
        "May is month 5".

    - Use collections.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        ArrayList<String> months = new ArrayList<>(Arrays.asList("JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"));

        for ( String month : months ){
            String m = month.toUpperCase();
            String test = input.toUpperCase();

            if (m.equals(test)){
                System.out.println(input + " is month " + (months.indexOf(test)+1));
            }
        }
    }
}
