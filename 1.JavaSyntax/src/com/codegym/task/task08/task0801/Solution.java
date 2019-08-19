package com.codegym.task.task08.task0801;

/* 
HashSet of plants

    watermelon, banana, cherry, pear, cantaloupe, blackberry, ginseng, strawberry, iris, potato
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> contents = new HashSet<>();

        contents.add("watermelon");
        contents.add("banana");
        contents.add("cherry");
        contents.add("pear");
        contents.add("cantaloupe");
        contents.add("blackberry");
        contents.add("ginseng");
        contents.add("strawberry");
        contents.add("iris");
        contents.add("potato");


        for (String s : contents ){
            System.out.println(s);
        }
    }
}
