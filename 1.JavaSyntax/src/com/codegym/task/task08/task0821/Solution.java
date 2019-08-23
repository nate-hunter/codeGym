package com.codegym.task.task08.task0821;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        Map<String, String> people = new HashMap<>();

        ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("Hunter", "Awaya", "Melendez", "Mckissick", "Ali"));
        ArrayList<String> firstNames = new ArrayList<>(Arrays.asList("Panda", "Jazz", "Peach", "Avo", "Light"));

        for (int i = 0; i < 10; i++){
            int lastIndex = (int)(Math.random() * lastNames.size());
            int firstIndex = (int)(Math.random() * firstNames.size());
            String lastName = lastNames.get(lastIndex);
            String firstName = firstNames.get(firstIndex);
            people.put(lastName, firstName);
        }

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
