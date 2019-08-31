package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private String name;
        private String eyeColor;
        private int weight;
        private int height;
        private String cityOfBirth;
        private Date dateOfBirth;

        public Human(String name) {
            this.name = name;
        }

        public Human(String cityOfBirth, Date dateOfBirth){
            this.cityOfBirth = cityOfBirth;
            this.dateOfBirth = dateOfBirth;
        }

        public Human(Date dateOfBirth){
            this.dateOfBirth = dateOfBirth;
        }

        public Human(Date dateOfBirth, String cityOfBirth){
            this.cityOfBirth = cityOfBirth;
            this.dateOfBirth = dateOfBirth;
        }

        public Human(String name, String cityOfBirth, Date dateOfBirth) {
            this.name = name;
            this.cityOfBirth = cityOfBirth;
            this.dateOfBirth = dateOfBirth;
        }

        public Human(String eyeColor, int weight, int height) {
            this.eyeColor = eyeColor;
            this.weight = weight;
            this.height = height;
        }

        public Human(String eyeColor, int weight, int height, Date dateOfBirth) {
            this.eyeColor = eyeColor;
            this.weight = weight;
            this.height = height;
            this.dateOfBirth = dateOfBirth;
        }

        public Human(String name, String eyeColor, int weight, int height) {
            this.name = name;
            this.eyeColor = eyeColor;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String eyeColor, int weight, int height, Date dateOfBirth) {
            this.name = name;
            this.eyeColor = eyeColor;
            this.weight = weight;
            this.height = height;
            this.dateOfBirth = dateOfBirth;
        }

        public Human(String name, String eyeColor, int weight, int height, String cityOfBirth, Date dateOfBirth) {
            this.name = name;
            this.eyeColor = eyeColor;
            this.weight = weight;
            this.height = height;
            this.cityOfBirth = cityOfBirth;
            this.dateOfBirth = dateOfBirth;
        }
    }
}


/*

985 - owed - credit actually

1945 - old rent
2295 - new rent

200 - fee

1925 - sec deposit
1925 - first month rent

1925 - last months rent


 */
