package com.codegym.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("AUGUST 22 2019"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        String[] strDateArray = date.split(" ");
        StringBuffer dateForm = new StringBuffer();

        for (int i = 0; i < strDateArray.length; i++){
            if (i == 0){
                dateForm.append(Character.toUpperCase(strDateArray[i].charAt(0))).append(strDateArray[i].substring(1).toLowerCase()).append(" ");
            }
            else if (i == 1) {
                dateForm.append(strDateArray[i]).append(" ");
            } else if( i == 2){
                dateForm.append(strDateArray[i]);
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.ENGLISH);
        LocalDate d = LocalDate.parse(dateForm, formatter);

        if (d.getDayOfYear() % 2 != 0 ){
            return true;
        } else {
            return false;
        }
    }
}

// INITIAL STRATEGY:
// The method `isDateOdd()` accepts a String argument. Inside the method:
//      1. convert the string to a date object
//      2. subtract from a variable which contains the date for the beginning of the year and assign to a variable
//      3. use if/else statement to determine if odd/even
//      4. return true/false based on #3's if/else statement

// SANDBOX ATTEMPTS:

/*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//        DateFormat df = new SimpleDateFormat("MMM d yyyy");
//        Date parsedDate = df.parse(date);
//        System.out.println("DATE:\n    " + parseDate);

        // TESTING LOCALE DATE CLASS:
//        String dateInString = "19590709";
//        LocalDate d = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);

//        LocalDate d = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);

//        String dateInString = "Mon, 05 May 1980";
//        DateTimeFormatter formatterT = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
//        LocalDate dT = LocalDate.parse(dateInString, formatterT);

//        String dateInString = "05 May 1980";
//        DateTimeFormatter formatterT = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
//        LocalDate dT = LocalDate.parse(dateInString, formatterT);
        xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/

/*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//        ArrayList<String> strDate = new ArrayList<>(Arrays.asList(date.split(" ")));
//        System.out.println(strDate);
//        String[] strDateArray = date.split(" ");

//        String month = "Calendar." + strDateArray[0];
//        int day = Integer.parseInt(strDateArray[1]);
//        int year = Integer.parseInt(strDateArray[2]);

//        for (int i = 0; i < strDateArray.length; i++){
//            System.out.println("    " + strDateArray[i]);
//            if ()
//        }

//        Calendar d = new GregorianCalendar(year, month, day);
//        System.out.println("CONVERTED DATE: " + month);
 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/


//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//------------------------------------------------- BEGIN YEAR:--------------------------------------------------------
//        Calendar yearBegin = new GregorianCalendar();
//        yearBegin.set(Calendar.MONTH, 0);
//        yearBegin.set(Calendar.DAY_OF_YEAR, 1);
////        yearBegin.set(Calendar.YEAR, );
//        System.out.println("YEAR BEGIN:\n    " + yearBegin.getTime());

//        long time = parseDate.getTime();


//        return true;


