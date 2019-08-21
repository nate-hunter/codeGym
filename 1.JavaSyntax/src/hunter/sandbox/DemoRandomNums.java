package hunter.sandbox;

import java.util.Random;

public class DemoRandomNums {

    public static void main(String[] args){
        Random r = new Random();
        int rand = r.nextInt(30) + 2;
        System.out.println("RANDOM: " + rand);

        int n = (int)(Math.random() * ((20 - 2) + 1)) + 2;
        int n2 = (int)(Math.random() * (20)) + 2;
        System.out.println("INT: " + n);
        System.out.println("INT: " + n2);

        double dub = Math.random();
        System.out.println("DOUBLE: " + dub);
    }

}
