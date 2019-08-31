package com.codegym.task.task10.task1012;

import javax.swing.text.html.parser.Entity;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {              // SHOULD BE i < 10 !!!!!!!!!!!!!!!!!!!!!!!!!!!!
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }



        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++){
            char c = alphabet.get(i);
            map.put(c,0);
        }

        // Will probably be faster/more efficient to iterate through each word rather than over each alphabet letter.
        // Because if an entered string is lengthy, it would suck to have to iterate over that each time I want to compare against the alphabet.

        for (int i = 0; i < list.size(); i++){                              // ITERATES over array of inputted words;
            String word = list.get(i);                                      // assigns each word element to a variable `word`;
            char[] letters = word.toCharArray();                            // assigns each character in `word` to an array of characters;
            for (int j = 0; j < letters.length; j++){                       // ITERATES over array of each character in the `letters` array
                int count = 0;
                try {
                    count = map.get(letters[j]);                            // assigns the value from `map` for the character currently iterating over

                } catch (NullPointerException e){
//                    System.out.println(e);
                }
                count++;                                                    // increases the value by (1);
                for ( Map.Entry<Character, Integer> e : map.entrySet() ){   // ITERATES over each key-value pair in `map`;
                    if (letters[j] == e.getKey()){                          // compares the `letter` currently iterating over with the `map`'s key
                        e.setValue(count);                                  // if the values match, `count` is assigned to `map`'s value.
                    }
                }
            }
        }

        for ( Map.Entry<Character, Integer> e : map.entrySet() ){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}
