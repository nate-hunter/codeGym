package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] str = input.split(" ");

        ArrayList<Character> vowelChars = new ArrayList<>();
        ArrayList<Character> otherChars = new ArrayList<>();

        for ( String s : str ){
            for ( char c : s.toCharArray() ){
                if (isVowel(c)){
//                System.out.println("VOWEL: " + c);
                    vowelChars.add(c);
                }
                else {
//                System.out.println("CONS/PUNCTUATION: " + c);
                    otherChars.add(c);

                }
            }
        }

        // PRINT CHARACTERS BASED ON VOWEL OR CONSONANT/PUNCTUATION
        for(int i = 0; i < vowelChars.size(); i++){
            if (i == vowelChars.size()-1){
                System.out.print(vowelChars.get(i) + " \n" );
            } else {
                System.out.print(vowelChars.get(i) + " ");
            }
        }

        for (int i = 0; i < otherChars.size(); i++){
            System.out.print(otherChars.get(i)+ " ");
        }


    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}

/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<Character> vowelChars = new ArrayList<>();
        ArrayList<Character> otherChars = new ArrayList<>();

        for ( char c : s.toCharArray() ){
            if (isVowel(c)){
//                System.out.println("VOWEL: " + c);
                vowelChars.add(c);
            }
            else {
//                System.out.println("CONS/PUNCTUATION: " + c);
                otherChars.add(c);

            }
        }

        for ( char c : vowelChars ) {
            System.out.print(c + " ");
        }
        System.out.println("");
        for ( char c : otherChars ){
            System.out.print(c + " ");
        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
 */