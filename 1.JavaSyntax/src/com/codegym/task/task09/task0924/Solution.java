package com.codegym.task.task09.task0924;

import java.util.ArrayList;
import java.util.Arrays;

/* 
A scary fairy tale

    Requirements:
1. The main method should change the state (internal variables) of the wolf object.
2. The main method should change the state (internal variables) of the woodcutter object.
3. Nobody ate the pie.
4. The wolf ate a little.
5. And then the wolf was killed.
*/

public class Solution {
    public static RedRidingHood hood = new RedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Pie pie = new Pie();
    public static Woodcutter woodcutter = new Woodcutter();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        // write your code here
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);

        woodcutter.killed.add(wolf);

    }

    // Red riding hood
    public static class RedRidingHood extends StoryItem {
    }

    // Grandmother
    public static class Grandmother extends StoryItem {
    }

    // Pie
    public static class Pie extends StoryItem {
    }

    // Woodcutter
    public static class Woodcutter extends StoryItem {
    }

    // Wolf
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
