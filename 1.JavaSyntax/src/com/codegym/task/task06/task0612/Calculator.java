package com.codegym.task.task06.task0612;

/* 
Calculator

*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / (double) b;
    }

    public static double percent(int a, int b) {
        double result = (double) b / 100 * (double) a;
        return result;
    }

    public static void main(String[] args) {



    }
}