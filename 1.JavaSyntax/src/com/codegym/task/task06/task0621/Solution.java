package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Grandfather (1)
        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName);

        // Grandmother (2)
        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName);

        // Father (3)
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, grandFather, "");

        // Mother (4)
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, "", grandMother);

        // Son (5)
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        // Daughter (6)
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
//        private Cat parent;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, String empty){
            this.name = name;
            this.father = father;
        }

        Cat(String name, String empty, Cat mother){
            this.name = name;
            this.mother = mother;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
//            this.parent = parent;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
//            if (parent == null)
//                return "The cat's name is " + name + ", no mother ";
//            else
//                return "The cat's name is " + name + ", " + parent.name + " is the mother";

            if(this.father == null && this.mother == null){
                return "The cat's name is " + name + ", no mother, no father";
            } else if(this.mother == null){
                return "The cat's name is " + name + ", no mother, " + this.father.name + " is the father";
            } else if(this.father == null){
                return "The cat's name is " + name + ", " + this.mother.name + " is the mother, no father";
            } else
                return "The cat's name is " + name + ", " + this.mother.name + " is the mother, " + this.father.name + " is the father";
        }
    }

}
