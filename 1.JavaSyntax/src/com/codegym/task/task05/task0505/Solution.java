package com.codegym.task.task05.task0505;

/* 
Feline carnage

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat pissy = new Cat("Pissy", 6, 25, 65);
        Cat huey = new Cat("Huey", 1, 45, 85);
        Cat linny = new Cat("Linny", 7, 20, 90);

        String fight1 = pissy.fight(huey) ? "Pissy Wins!" : "Huey Wins!";
        System.out.println("Fight 1: " + fight1);

        String fight2 = pissy.fight(linny) ? "Pissy Wins!" : "Linny Wins!";
        System.out.println("Fight 2: " + fight2);

        String fight3 = huey.fight(linny) ? "Huey Wins!" : "Linny Wins!";
        System.out.println("Fight 3: " + fight3);
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
