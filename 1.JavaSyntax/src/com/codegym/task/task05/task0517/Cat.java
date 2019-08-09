package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name){
        this.name = name;
        this.age = 1;
        this.weight = 25;
        this.color = "charcoal";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "charcoal";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 25;
        this.color = "charcoal";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
