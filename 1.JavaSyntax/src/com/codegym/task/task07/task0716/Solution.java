package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("knee");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<String> returnList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);

            if (s.contains("r") && s.contains("l")){
                returnList.add(s);
            } else if (s.contains("l") && !(s.contains("r"))){
                returnList.add(s);
                returnList.add(s);
            } else if (s.contains("r")){

            } else {
                returnList.add(s);
            }
        }

        return returnList;
    }
}