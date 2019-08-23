package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        Human daughterMacGail = new Human("Daughter Gail", false, 60);
        Human sonMacGare = new Human("Son Gare", true, 59);
        Human daughterMacNan = new Human("Daughter Nancy", false, 55);

        ArrayList<Human> childrenMacJeg = new ArrayList<Human>(Arrays.asList(daughterMacGail, sonMacGare, daughterMacNan));
//        ArrayList<Human> childrenMacJeg = new ArrayList<>();
//        childrenMacJeg.add(daughterMacGail);
//        childrenMacJeg.add(sonMacGare);
//        childrenMacJeg.add(daughterMacNan);

        Human fatherMac = new Human("Father Mac", true, 83, childrenMacJeg);
        Human motherJeg = new Human("Mother Jeg", false, 82, childrenMacJeg);

        Human grandpaMac = new Human("Grandpa Mac", true, 103, fatherMac);
        Human grandmaMac = new Human("Grandma Mac", false, 100, fatherMac);

        Human grandpaJeg = new Human("Grandpa Jeg", true, 105, motherJeg);
        Human grandmaJeg = new Human("Grandma Jeg", false, 101, motherJeg);


        Human[] famArr = {grandmaJeg, grandpaJeg, grandpaMac, grandmaMac, fatherMac, motherJeg, daughterMacGail, sonMacGare, daughterMacNan};
        ArrayList<Human> family = new ArrayList<>(Arrays.asList(famArr));
        for ( Human fam : family ){
            System.out.println(fam.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human child){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child);
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
