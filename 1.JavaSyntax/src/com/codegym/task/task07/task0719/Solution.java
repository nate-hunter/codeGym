package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order

Enter 10 numbers from the keyboard and put them in a list.
Display them in reverse order. Each element on a new line.
Use only a for loop.

Requirements:
•	Declare an integer list variable and immediately initialize it.
•	Read 10 integers from the keyboard and add them to the list.
•	Display the numbers in reverse order.
•	Use a for loop.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> ints = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            String s = reader.readLine();
            ints.add(Integer.parseInt(s));
        }

        for (int i = ints.size() - 1; i >= 0; i--) {
            System.out.println(ints.get(i));
        }
    }
}
