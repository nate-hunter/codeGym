package com.codegym.task.task10.task1007;

/* 
Task No. 7 about integer type conversions

    TARGET:  1234567

*/

public class Solution {
    public static void main(String[] args) {
        long l = 1234_564_890L;                         // w/byte = `26`;  w/out = `1234564890`; w/short = `-2278`;
        int x =  0b1000_1100_1010;                       // w/byte = `-54`; w/short = `2251`; bw/char = `2250`; w/out = `2`;
        double m = (short)110_987_654_6299.123_34;      // w/byte = `1.0`; w/char = `65537.0`; w/short = `-1.0`; w/int = `2.147483647E9`; w/ long =`1.109876546299E12`; w/float = same as long;
        float f =  l++ + 10 + ++x - (float) m;
        l = (long) (f / 1000);
        System.out.println(l);
    }
}