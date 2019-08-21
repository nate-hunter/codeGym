package com.codegym.task.task08.task0802_HashMapRef;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> pairs = new HashMap<>();

        pairs.put("watermelon", "melon");
        pairs.put("banana", "fruit");
        pairs.put("cherry", "fruit");
        pairs.put("pear", "fruit");
        pairs.put("cantaloupe", "melon");
        pairs.put("blackberry", "fruit");
        pairs.put("ginseng", "root");
        pairs.put("strawberry", "fruit");
        pairs.put("iris", "flower");
        pairs.put("potato", "tuber");

        for (String s : pairs.keySet()){
            System.out.println(s + " - " + pairs.get(s));
        }

    }
}

/*
Example
// Print keys
        for (String i : capitalCities.keySet()) {
        System.out.println(i);
        }
        Example
// Print values
        for (String i : capitalCities.values()) {
        System.out.println(i);
        }
        Example
// Print keys and values
        for (String i : capitalCities.keySet()) {
        System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

--------------------------------------------------------
// Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

// Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
          System.out.println("key: " + i + " value: " + people.get(i));
        }
--------------------------------------------------------

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
 */

