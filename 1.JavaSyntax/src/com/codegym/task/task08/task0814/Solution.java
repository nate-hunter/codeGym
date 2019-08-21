package com.codegym.task.task08.task0814;

import java.util.*;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        Set<Integer> limbs = new HashSet<>();

//        for (int i = 0; i < 20; i++){
//            int j = 10;
//            int z = 2;
//            int n = (int) (Math.random() * 50) + 2;
//            if (limbs.contains(n)) {
//                limbs.add(n*j*z);
//                j++;
//                z++;
//            } else {
//                limbs.add(n);
//            }
//        }

        while (limbs.size() < 20) {
            int n = (int) (Math.random() * 30) + 2;
//            if (limbs.contains(n)) {
//                limbs.add(n);
//            }
//            else {
//                limbs.add(n);
//            }
                limbs.add(n);
        }

        return (HashSet<Integer>) limbs;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        HashSet<Integer> result = new HashSet<>();

        for ( Integer n : set ){
            if (n <= 10){
                result.add(n);
            }
        }

//        System.out.println("ORIGINAL: " + set);
//        System.out.println("RESULT: " + result);
        return result;
    }

    public static void main(String[] args) {
        HashSet<Integer> setIntegers = createSet();

        System.out.println(setIntegers);
        System.out.println("SIZE: " + setIntegers.size());

        removeAllNumbersGreaterThan10(setIntegers);

//        String stringSet = createSet().toString();
//        stringSet.split(",");
//        System.out.println(stringSet);

    }
}



/*
EXAMPLE:
    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        for ( Integer number : set ) {
            if (number >= 10) {
                set.remove(number);
            }
        }
        return set;
    }

// You cannot remove items from a set in a foreach loop. It will screw up the internal order and you end up
// with a ConcurrentModificationException and subsequent crash. You need to create an Iterator:

    Iterator<Integer> itr = *Set*.Iterator();

// **Notice that Set is capitalized, that is because you can use this with any set type
// (HashSets, LinkedHashSet, TreeSet) as well as Maps and Lists. Make sure that you do not type 'Set' like above,
// but the actual variable that is of Set (or other) type.***

// Inside the angle bracket needs to be the same base type as the set (or other) that you are going to iterate through,
// in this case Integer. You can name it anything, i used itr, short for iterator. Then set it equal to the Iterator()
// method of the set you want to iterate through.

// Then to iterate you use a while loop and call itr.hasNext() (which returns true if there are still values
// left to iterate through, or false otherwise). Then you can call itr.next() to pull the next value,
// check if is greater than 10, and remove it SAFELY with itr.remove();

    while(itr.hasNext())
       if(itr.next() > 10)
          itr.remove();

 */
