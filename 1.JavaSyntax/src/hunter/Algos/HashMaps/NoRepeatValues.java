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

