package com.codegym.task.task09.task0929;

import java.io.*;

/* 
Let's make the code do something useful!

    # Task:
        - The program reads in two file names. It copies the first file to the location specified by the second file name.
    # New task:
        - The program reads in two file names. It copies the first file to the location specified by the second file name.
        - If the specified file (to be copied) does not exist, then the program should display "File does not exist."
          and read a file name one more time and only then read the destination file name.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        InputStream fileInputStream = null;
        try {
            fileInputStream = getInputStream(sourceFileName);
        } catch (Exception e) {
            System.out.println("File does not exist.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = null;
        try {
            fileOutputStream = getOutputStream(destinationFileName);
        }
        catch (Exception e){
            System.out.println("File does not exist.");
            destinationFileName = reader.readLine();
            fileOutputStream = getOutputStream(destinationFileName);
        }

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();


    }
    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

