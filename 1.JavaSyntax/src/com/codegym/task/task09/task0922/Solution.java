package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

    Enter a date in the format "2013-08-18"
    Display this date in the format "AUG 18, 2013".
    Use a Date object and SimpleDateFormat.

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        // EXPECTED DATE FORMAT FOR INPUT:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // CONVERT STRING INPUT TO A DATE OBJECT (TO BE CONVERTED TO DESIRED FORMAT)
            Date date = df.parse(s);

            // DATE FORMAT INPUT IS TO BE CONVERTED TO:
            SimpleDateFormat form = new SimpleDateFormat("MMM dd, yyyy");

            // CONVERTS DATE OBJECT INTO A STRING IN THE FORMAT DEFINED BY `form`
            String convDate = form.format(date).toUpperCase();

//        System.out.println("STRING DATE: " + date);
//        System.out.println("CONVERTED DATE: " + convDate);
            System.out.println(convDate);
        }
        catch (ParseException e){
            System.out.println(e);
        }



    }
}

/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();       // Reads input and sets to String `s`;

        // EXPECTED DATE FORMAT FOR INPUT:
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");       // Assigns a date pattern to SimpleDateFormat `df`;

        // CONVERT STRING INPUT TO A DATE OBJECT (TO BE CONVERTED TO DESIRED FORMAT)
        Date date = df.parse(s);        // Checks if `s` can be parsed into a Date object based on the format defined by `df`;

        // DATE FORMAT INPUT IS TO BE CONVERTED TO:
        SimpleDateFormat form = new SimpleDateFormat("MMM d, yyyy");        // Assigns a date pattern to SimpleDateFormat `form`;

        // CONVERTS DATE OBJECT INTO A STRING IN THE FORMAT DEFINED BY `form`
        String convDate = form.format(date);

        System.out.println("STRING DATE: " + date);
        System.out.println("CONVERTED DATE: " + convDate);
 */