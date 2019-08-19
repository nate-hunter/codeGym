package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Lists:
        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> listThree = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listRest = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = 5;

        for (int i = 0; i < size; i++){
            String s = reader.readLine();
            int n = Integer.parseInt(s);
            listMain.add(n);
        }

        for (int i = 0; i < listMain.size(); i++){
            int n = listMain.get(i);

            if (n % 3 == 0 && n % 2 == 0){
                listThree.add(n);
                listTwo.add(n);
            } else if (n % 3 == 0){
                listThree.add(n);
            } else if (n % 2 == 0){
                listTwo.add(n);
            } else {
                listRest.add(n);
            }
        }

        System.out.println("MAIN:");
        printList(listMain);
        System.out.println("THREE: ");
        printList(listThree);
        System.out.println("TWO:");
        printList(listTwo);
        System.out.println("THE REST:");
        printList(listRest);
    }

    public static void printList(List<Integer> list) {
        for(int i : list){
            System.out.println(i);
        }
    }
}
