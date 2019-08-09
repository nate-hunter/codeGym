package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(Rectangle copy){
        this.top = copy.top;
        this.left = 4;
        this.width = copy.width;
        this.height = copy.height;
    }

    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.initialize(7,8,7,9);

        Rectangle r2 = new Rectangle();
        r2.initialize(r1);

        System.out.println("Top: " + r2.top);
        System.out.println("Left: " + r2.left);
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
    }
}
