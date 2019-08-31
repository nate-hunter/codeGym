package hunter.clarification;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithArrayLists {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String> drinks = new ArrayList<>();
        ArrayList<String> furnitures = new ArrayList<>();
        ArrayList<String> instruments = new ArrayList<>();

        ArrayList<String>[] stringRays = new ArrayList<ArrayList<String>>(Arrays.asList(drinks, furnitures, instruments)).toArray(new ArrayList[0]);


        drinks.add("coffee");
        drinks.add("water");
        drinks.add("booze");

        furnitures.add("chair");
        furnitures.add("table");
        furnitures.add("bed");
        furnitures.add("couch");

        instruments.add("guitar");
        instruments.add("drums");
        instruments.add("bass");
        instruments.add("piano");
        instruments.add("trumpet");

        return stringRays;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
