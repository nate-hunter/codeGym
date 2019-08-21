package com.codegym.task.task08.task0815;

import java.util.*;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> names = new HashMap<>();

        Random r = new Random();
        ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("Hunter", "Melendez", "Ali", "Awaya", "McKissick", "Panda", "Coffee", "Polar", "Suzuki", "Augusta", "Seltzer", "Avocado", "Diaz"));
        ArrayList<String> firstNames = new ArrayList<>(Arrays.asList("Panda", "Jazz", "Van", "Lili", "Holli", "Light", "Avo", "Umbi"));

        while(names.size() < 10){
            int randIndexLast = r.nextInt(lastNames.size());
            int randIndexFirst = r.nextInt(firstNames.size());

            String lastName = lastNames.get(randIndexLast);
            String firstName = firstNames.get(randIndexFirst);

            names.put(lastName, firstName);
        }

       return names;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int result = 0;

        for ( String first : map.values() ){
            if (first.compareTo(name) == 0){
                result++;
            }
        }

        return result;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int result = 0;

        for ( String last : map.keySet() ){
              if (last.compareTo(lastName) == 0){
                result++;
            }
        }

        return result;

    }

    public static void main(String[] args) {

//        HashMap<String, String> mapCreated = createMap();
//        System.out.println(mapCreated);
//        System.out.println("SIZE: " + mapCreated.size());
//
//        System.out.println("FIRST NAME MATCHES: " + getSameFirstNameCount(mapCreated, "Panda"));
//        System.out.println("LAST NAME MATCHES: " + getSameLastNameCount(mapCreated, "Panda"));


    }
}

