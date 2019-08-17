package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas
Requirements:
//1. In the Solution class, create the public static Idea class.
//2. In the Idea class, create the public String getDescription() method.
//3. The getDescription method must return any non-empty string.
//4. In the Solution class, create a public static void printIdea(Idea idea) method.
5. The printIdea method should display the idea description on the screen.
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    public static class Idea {

        public String getDescription(){
            return "This idea is so great";

        }

    }
}
