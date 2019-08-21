package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

    Hint: At CodeGym, summer lasts from June 1 to August 31.

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone[0]", df.parse("AUGUST 11 1980"));
        map.put("Willis[1]", df.parse("JULY 24 1994"));

        ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("Hunter", "Melendez", "Ali", "Awaya", "McKissick", "Panda", "Coffee", "Polar", "Suzuki", "Augusta", "Seltzer", "Avocado", "Diaz"));
        ArrayList<String> months = new ArrayList<>(Arrays.asList("JANUARY", "MARCH", "MAY", "JUNE", "AUGUST", "OCTOBER", "DECEMBER"));

        int j = 2;
        while (map.size() < 10){
            int lastInt = (int) (Math.random() * lastNames.size());
            int monthInt = (int) (Math.random() * months.size());
            String rName = lastNames.get(lastInt);
            String rMonth = months.get(monthInt);
            int day = (int) (Math.random() * 30) + 1;

            map.put(rName + "[" + j + "]", df.parse(rMonth + " " + day + " 1987"));
            j++;
        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        int summerBegins = df.parse("JUNE 1 1987").getMonth();
        int summerEnds = df.parse("AUGUST 31 1987").getMonth();

        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();

        int i = 1;
        while (itr.hasNext()){
//            System.out.println("ITERATIONS: " + i);
            Map.Entry<String, Date> stud = itr.next();

//            System.out.println("    " + stud);
//            System.out.println("    " + itr.next().getKey());
//            System.out.println("    " + itr.next().getKey() + ": " + itr.next().getValue());
            int birthMonth = stud.getValue().getMonth();
            if (birthMonth >= summerBegins && birthMonth <= summerEnds) {
//                System.out.println("    REMOVED: " + stud.getKey() + " - " + stud.getValue());
                itr.remove();

            }
            i++;
        }

//        System.out.println("SIZE: " + map.size());
//        for (Map.Entry<String, Date> stud : map.entrySet() ){
//            System.out.println("    " + stud.getKey() + ": " + stud.getValue());
//        }
    }

    public static void main(String[] args) throws ParseException {
//        HashMap<String, Date> students = createMap();
////        System.out.println(students);
//        System.out.println("SIZE: " + students.size());
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        removeAllSummerPeople(students);
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        System.out.println("SIZE: " + students.size());
//
//        for (Map.Entry<String, Date> stud : students.entrySet() ){
//            System.out.println("    " + stud.getKey() + ": " + stud.getValue());
//        }

    }
}

