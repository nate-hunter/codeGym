package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){

            try {
                int num = Integer.parseInt(reader.readLine());
                numbers.add(num);
            } catch (NumberFormatException e){
                for ( int num : numbers ){
                    System.out.println(num);
                }
                break;
            }catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
