package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args)
    {
        try {
            divideByZero();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    public static void divideByZero() throws ArithmeticException {
        int result = 32 /0;
        System.out.println(result);
    }
}
