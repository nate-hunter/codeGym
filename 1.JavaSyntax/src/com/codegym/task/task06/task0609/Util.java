package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double distance = 0;

        double x = (x2 - x1)*(x2 - x1);
        double y = (y2 - y1)*(y2 - y1);

        distance = Math.sqrt(x + y);

        return distance;
    }

    public static void main(String[] args) {

        double result = getDistance(2, 3, 10, 15);

        System.out.println(result);

    }
}
