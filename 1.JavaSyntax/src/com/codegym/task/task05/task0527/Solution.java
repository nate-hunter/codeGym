package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog spikeDog = new Dog("Spike", 25, "Medium");

        Cat tomCat = new Cat("Tom", 18, 2);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        String barkVolume;

        public Dog(String name, int height, String barkVolume) {
            this.name = name;
            this.height = height;
            this.barkVolume = barkVolume;
        }
    }

    public static class Cat {
        String name;
        int height;
        int clawLength;

        public Cat(String name, int height, int clawLength) {
            this.name = name;
            this.height = height;
            this.clawLength = clawLength;
        }
    }
}
