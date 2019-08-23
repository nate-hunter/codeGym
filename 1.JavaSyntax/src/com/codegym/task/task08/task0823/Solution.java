package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();

        // WORKING CODE:
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));

        Iterator<String> itr = words.iterator();
        while (itr.hasNext()){
            String w = itr.next();
            if (w.isEmpty()){
//                System.out.println("--EMPTY--");
                itr.remove();
            }
        }

//        System.out.println("LIST ARRAY: " + words);

        StringBuffer strBuf = new StringBuffer();

        for (String w : words){
            strBuf.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }

        String printStr = strBuf.toString();
        strBuf.trimToSize();
        System.out.println(printStr);
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

        // ATTEMPT USING STRING ARRAY WITH `StringBuffer`
//        String[] str = s.split(" ");
//        for (String w : words){
////        for (String w : str){
//            if (w.isEmpty()){
////            if (w.contains(" ")) {
////            if (w.equals(" ")){
//                System.out.println("YOOOO");
//                words.remove(w);
//            }
//        }


//        System.out.println("STRING ARRAY: " + Arrays.toString(str));
//
//        StringBuffer strBuf = new StringBuffer();
//
//        for (String w : words){
////            Character.toUpperCase(w.charAt(0));
//            strBuf.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
//        }
//
//        String printStr = strBuf.toString();
//        strBuf.trimToSize();
////        String printStr = strBuf.toString().trim();
////        String printStr = Arrays.toString(str);
//        System.out.println(printStr);


//        for (String w : str){
////            Character.toUpperCase(w.charAt(0));
//            if (w.length() == 0){
//
//            }
//            strBuf.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
//
//        }
//
//        String printStr = strBuf.toString();
//        strBuf.trimToSize();
////        String printStr = strBuf.toString().trim();
////        String printStr = Arrays.toString(str);
//        System.out.println(printStr);




        // ATTEMPT USING CHARACTER ARRAY
//        char[] wordChars = s.toCharArray();
//
//        for (int i = 0; i < wordChars.length; i++){
//            String str = String.valueOf(wordChars[i]);
////            System.out.println("  CHAR: " + str.length());
//
//            if (wordChars[i] == ' '){
//                System.out.println("  CHAR: " + wordChars[i] + 32);
//            }
//        }

//        System.out.println(wordChars);


//     -----------------------------------------------------------------------------
        // Below accomplishes the task's goal but doesn't meet its requirements.
//        System.out.println("ARRAY LENGTH: " + s.split(" ").length);

//        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
////        System.out.println("    WORDS: " + words);
//
//        ArrayList<String> capWordsArray = new ArrayList<>();
//
//        for (String w : words){
//            String cap = w.substring(0,1).toUpperCase();
//            String word = cap + w.substring(1);
//            capWordsArray.add(word);
//
////            System.out.println("  " + word);
//        }
//
//        String capWords = "";
//
//        for (String w : capWordsArray){
//            capWords += " "  +  w;
//        }
//
//        s = capWords.substring(1);
//
////        System.out.println("    WORDS: " + capWords.substring(1));
//
//        System.out.println(s);
//     -----------------------------------------------------------------------------





        // ATTEMPT USING ITERATOR:
//        Iterator<String> itr = words.iterator();
//        while (itr.hasNext()) {
//            String word = itr.next();
//
//            String.valueOf(word.charAt(0)).toUpperCase();
//            System.out.println("  " + word);
//
//        }


        // ATTEMPT USING FOR LOOP OVER STRING ARRAY OF THE WORDS
//        for (int i = 0; i < words.length; i++){
//            System.out.println(words[i]);
//            String word = words[i];
//
//            char letter = word.charAt(0);
//            String l = String.valueOf(letter).toUpperCase();
//            System.out.println("    LETTER: " + l);
//
////            for (int j = 0; j < 1; j++){
////
////            }
//        }

    }
}
