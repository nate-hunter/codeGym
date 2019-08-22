package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("    PETS SIZE: " + pets.size());
        removeCats(pets, cats);
        printPets(pets);
        System.out.println("    PETS SIZE: " + pets.size());

    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        for (int i = 0; i < 4; i++){
            result.add(new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++){
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        Set<Object> pets = new HashSet<>(cats);
        pets.addAll(dogs);
        System.out.println("JOINED PETS: " + pets.size());
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        pets.removeAll(cats);

//        Iterator<Object> itr = pets.iterator();
//        System.out.println("    REMOVE CATS METHOD:");
////        System.out.println("    CATS OBJ: " + cats);
//
//        if (pets.containsAll(cats)){
//            System.out.println("-PURRRR-");
//        }
//
//        while (itr.hasNext()){
//            Object obj = itr.next();
//
//            if (pets.contains(cats)){
//                System.out.println("Purr");
//            }
//
//        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for ( Object pet : pets ){
            System.out.println(pet.getClass());
        }
    }

    //write your code here
    public static class Cat {

    }

    public static class Dog {

    }
}
