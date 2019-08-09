package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        boolean fightResult = false;

        double scoreThisCat = (age * 0.5) + (weight * 0.3) + (strength * 0.4);
        double scoreAnotherCat = (anotherCat.age * 0.5) + (anotherCat.weight * 0.3) + (anotherCat.strength * 0.4);

        if(scoreThisCat > scoreAnotherCat){
            fightResult = true;
        } else if (scoreAnotherCat > scoreThisCat){
            fightResult = false;
        }

        return fightResult;
    }

    public static void main(String[] args) {

        Cat pissy = new Cat();
        pissy.age = 5;
        pissy.weight = 25;
        pissy.strength = 60;

        Cat huey = new Cat();
        huey.age = 1;
        huey.weight = 40;
        huey.strength = 85;

        boolean fightResult1 = pissy.fight(huey);
        boolean fightResult2 = huey.fight(pissy);
        System.out.println("Pissy wins: " + fightResult1);
        System.out.println("Huey wins: " + fightResult2);

    }
}
