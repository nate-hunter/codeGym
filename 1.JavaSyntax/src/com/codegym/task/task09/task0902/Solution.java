package com.codegym.task.task09.task0902;

/* 
Stack trace revisited
    StackTraceElement Array:
    Index 0 = StackTrace
    Index 1 = current method
    Index 2 = invoking method
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method2() {
        method3();

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method3() {
        method4();

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method4() {
        method5();

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }
}
