package com.codegym.task.task10.task1003;

/* 
Task No. 3 about integer type conversions

    Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain a float variable f.
4. The main() method must contain an int variable i.
5. The main() method must contain an int variable b.
6. Don't change the initial value of the variables during initialization. You can only add cast operators.
7. The program should display the number 0.

*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
}
