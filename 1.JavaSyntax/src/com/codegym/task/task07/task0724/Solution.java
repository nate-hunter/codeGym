package com.codegym.task.task07.task0724;

/* 
Family census
    Requirements:
    1. The program must not read data from the keyboard.
    2. Add the following fields to the Human class: String name, boolean sex, int age, Human father, and Human mother.
    3. Add a constructor: public Human(String name, boolean sex, int age).
    4. Add a constructor: public Human(String name, boolean sex, int age, Human father, Human mother).
    5. Create 9 different Human objects (4 objects without a father and mother and 5 objects with them).
    6. Display all the created objects on the screen.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human tom = new Human("Tom", true, 74);
        Human peach = new Human("Peach", false, 73);
        Human john = new Human("John", true, 76);
        Human bonnie = new Human("Bonnie", false, 76);

        Human panda = new Human("Panda", true, 35, tom, peach);
        Human pina = new Human("Pineapple", false, 34, john, bonnie);

        Human jj = new Human("JJ", true, 12, panda, pina);
        Human nevin = new Human("Nevin", true, 14, panda, pina);
        Human dani = new Human("Daniella", false, 13, panda, pina);

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(tom);
        humans.add(peach);
        humans.add(john);
        humans.add(bonnie);
        humans.add(panda);
        humans.add(pina);
        humans.add(jj);
        humans.add(nevin);
        humans.add(dani);

        for ( Human h : humans ){
            System.out.println(h.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}