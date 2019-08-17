package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        return str;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(reader.readLine());

        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double dub = Double.valueOf(reader.readLine());

        return dub;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean bool = Boolean.valueOf(reader.readLine());

        return bool;
    }

    public static void main(String[] args) throws Exception {

        String str = readString();
        int in = readInt();
        double dub = readDouble();
        boolean boo = readBoolean();

        System.out.println("String: " + str);
        System.out.println("Integer: " + in);
        System.out.println("Double: " + dub);
        System.out.println("Boolean: " + boo);

        if (boo){
            System.out.println("\n" + dub*in);
        }

    }
}
