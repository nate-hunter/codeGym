package hunter.Algos.HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
We don't need repeats
  Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
  Remove people with the same first name.

Requirements:
  1. The program should not display text on the screen.
  2. The program should not read values from the keyboard.
  3. The createMap() method must create and return a HashMap that has (String, String) elements and contains 10 entries.
  4. The removeFirstNameDuplicates() method must remove from the map all people who have the same first name.
  5. The removeFirstNameDuplicates() method must call the removeItemFromMapByValue() method.

 */

public class NoRepeatValues {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> entries = new HashMap<>();

        ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("Hunter", "Melendez", "Ali", "Awaya", "McKissick", "Panda", "Kim", "Coffee", "Polar", "Suzuki", "Augusta", "Seltzer", "Avocado", "Diaz"));
        ArrayList<String> firstNames = new ArrayList<>(Arrays.asList("Panda", "Jazz", "Van", "Lili", "Holli", "Light", "Avo", "Umbi"));

        while (entries.size() < 10){
            int randomIndexLastName = (int)(Math.random() * lastNames.size());
            int randomIndexFirstName = (int)(Math.random() * firstNames.size());
            String lastName = lastNames.get(randomIndexLastName);
            String firstName = firstNames.get(randomIndexFirstName);
            entries.put(lastName, firstName);
        }

        return entries;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> names = new ArrayList<>();

        for ( String first : map.values() ){
            names.add(first);
        }

        // how does this affect big 0 if the second loop decreases with each iteration?
        for (int i = 0; i < names.size(); i++){
            System.out.println("["+i+"]");      // behaviour of i
            for (int j = i+1; j < names.size(); j++){
                System.out.println("  j: " + j);        // behaviour of j
                if (names.get(i).compareTo(names.get(j)) == 0){
//                    System.out.print("    [" + i + "] "+ names.get(i) );
                    removeItemFromMapByValue(map, names.get(i));
                }
            }
        }

        System.out.println("\nFIRST NAMES: " + names);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

        HashMap<String, String> entries = createMap();
        System.out.println("ORIGINAL:");
        System.out.println("    " + entries);
        System.out.println("SIZE: " + entries.size());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        removeFirstNameDuplicates(entries);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("AFTER METHOD:");
        System.out.println("    " + entries);
        System.out.println("SIZE: " + entries.size());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

/*
# FROM COMMENTS:

## USES RECURSION:
public static void removeFirstNameDuplicates(Map<String, String> map) {
    ArrayList<String> test = new ArrayList<>();

    for(Map.Entry<String, String> pair : map.entrySet()){
        if(!test.contains(pair.getValue())) test.add(pair.getValue());
        else{
            removeItemFromMapByValue(map, pair.getValue());
            removeFirstNameDuplicates(map);
            break;
        }
    }
}

## EXPLANATION:
It is a recursive function ( ill post a link below). Read my posts below detailing how the original
poster was iterating through a collection while making changes to it (removing items to be specific).

Basically my function, by calling itself with 'map' after an item is removed, starts the iterating
process over and avoids iterating over a collection while removing from that same collection. This
works because collections are passed by reference which means that changes in a function will change
value that is being passed in, unlike with primitives (ill post an example). The function will hold
at line 8 each time until the function call is returned. The last level will just reach the end
without the 'else' block being activated, then when returned up, the next line breaks each level all
the way back until the code reaches main. I'll try to illustrate that here:

from main removeItems(map)
  else block 1: removeItems()
    else block 2: removeItems()
     else block 3: removeItems()
       no items removed level 4:
     else block 3: break
    else block 2: break
  else block 1; break
next line in main

Recursive function link: https://introcs.cs.princeton.edu/java/23recursion/

## ALSO:
primitive change example, copy this into your IDE and run:

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 5;
        System.out.println("The value of x in main before function is: " + x);
        addFive(x);
        System.out.println("The value of x in main after function is: " + x);
    }

    static public void addFive(int x){
        x = x+ 5;
        System.out.println("The value of x in function is: " + x);
    }
}

The function does not change the value of the variable x in the main, this is because x is a
primitive and is not passed by reference. Change int to an int[] (which is not primitive), like
below, and run code and see the difference:

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] x = {5,2};
        System.out.println("The values of x in main before function are: " + Arrays.toString(x));
        addFive(x);
        System.out.println("The values of x in main after function are: " + Arrays.toString(x));
    }

    static public void addFive(int[] x){
        for(int i = 0; i < x.length; i++) x[i] = x[i] + 5;
        System.out.println("The values of x in function are: " + Arrays.toString(x));
    }
}


 */

