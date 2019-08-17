package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> str = new ArrayList<String>();

        str.add("coffee");
        str.add("panda");
        str.add("burger");
        str.add("couch");
        str.add("knee");

        System.out.println(str.size());

        for ( String s : str ) {
            System.out.println(s);
        }
    }
}
