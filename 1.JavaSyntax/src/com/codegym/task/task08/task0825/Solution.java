package com.codegym.task.task08.task0825;

/* 
Mixed-up modifier

*/

public class Solution {
    public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}

/*
ORIGNAL CODE:
public class Solution {
    public int A = 5;           // Does `D` not recognize `A` b/c:  `this.A` and `null.D` can't "communicate" with each other
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public static int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}

QUESTIONS:
Solution.getValue(<Object> ref) ???

 */
