package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> pairs = new HashMap<>();

//        int id = Integer.parseInt(reader.readLine());
//        String name = reader.readLine();

//        String strID = reader.readLine();
//        int id = Integer.parseInt(strID);
//        String name = reader.readLine();
//
//        if (strID.length() > 0 && name.length() > 0){
//            pairs.put(name, id);
//            int idLoop = Integer.parseInt(reader.readLine());
//            String nameLoop = reader.readLine();
//            while (pairs.isEmpty()){
//                pairs.put(nameLoop, idLoop);
//                break;
//            }
//        }

        while (true){
            try {
                String strID = reader.readLine().trim();
                int id = Integer.parseInt(strID);
                String name = reader.readLine();
                if (!(name.length() > 0)) {
                    pairs.put(" ", id);
                    break;
                }
                pairs.put(name, id);
            }
            catch (Exception e){
//                System.out.println(e);
                break;
            }
//            if (strID.length() > 0 && name.length() > 0){
//                pairs.put(name, id);
//            } else{
//                break;
//            }
        }

        for (Map.Entry<String, Integer> e : pairs.entrySet() ){
            System.out.println(e.getValue() + " " + e.getKey());
        }

//        System.out.println("Id=" + id + " Name=" + name);
    }
}
