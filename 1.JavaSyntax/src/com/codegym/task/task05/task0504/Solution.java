package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        Cat pissy = new Cat("Pissy", 6, 25, 65);
        Cat huey = new Cat("Huey", 1, 45, 85);
        Cat linny = new Cat("Linny", 7, 20, 90);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}