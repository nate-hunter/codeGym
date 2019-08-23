package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,String> families = new HashMap<>();

        while(true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String name = reader.readLine();

            families.put(city, name);

        }

        String input = reader.readLine();

        if(input.length() > 0){
            for (Map.Entry<String, String> s : families.entrySet() ){
                if (input.equals(s.getKey())){
                    System.out.println(s.getValue());
                }
            }

        }



// ---------------------- ORIGINAL CODE--------------------------------------------------------------------------------
/*
        // List of addresses
        List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familyName = addresses.get(houseNumber);
            System.out.println(familyName);
        }
 */


    }
}
