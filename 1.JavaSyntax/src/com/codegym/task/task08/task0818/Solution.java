package com.codegym.task.task08.task0818;

import hunter.helpermethods.GetLastNames;

import java.util.*;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> prospects = new HashMap<>();

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Hunter", "Melendez", "Ali", "Awaya", "McKissick", "Panda", "Kim", "Coffee", "Polar", "Suzuki", "Augusta", "Seltzer", "Avocado", "Diaz"));

        while (prospects.size() < 10){
            int index = (int) (Math.random() * names.size());
            String name = names.get(index);
            int salary = (int)(Math.random() * 2000) + 1;
            prospects.put(name, salary);
        }

        // Testing whether `GetLastNames` class works  =>  it does
        GetLastNames ln1 = new GetLastNames();
        String lastName = ln1.getRandomLastName();
        System.out.println(lastName);

        return prospects;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        // There's two ways to go about this:
        // 1. Use the `Iterator` object to iterate through `map` and remove from the list the entries that qualify
        //      (Remember to use remove() `Iterator` object rather than `map.remove()` which will cause an modification error.)
        // 2. Copy the values to test into an ArrayList, iterate through that, and remove an entry from `map` w/in that loop.
        // Which way is best and why? Which is transferable to other languages?

        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Integer> entry = itr.next();

            int salary = entry.getValue();

            if (salary < 500){
//                System.out.println("    SALARY < 500 || " + entry.getKey() + ": " + salary);
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
//        System.out.println("PROSPECTS: \n    " + map);
//        System.out.println("SIZE: " + map.size());
//
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        removeItemFromMap(map);
//        System.out.println("PROSPECTS ABOVE 500: \n    " + map);
//        System.out.println("SIZE: " + map.size());
    }
}