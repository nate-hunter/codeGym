package com.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10 thousand deletions and insertions

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList 2
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++){
            String item = "item0" + i;
            list.add(item);
        }

    }

    public static void get10000(List list) {
        for (int i = 0; i < 10000; i++){
            list.get(i);
        }

    }

    public static void set10000(List list) {
        Date begin = new Date();
        for (int i = 0; i < 10000; i++){
            String item = "new item0" + i;
            list.set(i, item);
        }

        Date end = new Date();

        long diff = end.getTime() - begin.getTime();

//        System.out.println(diff);

    }

    public static void remove10000(List list) {
        Date begin = new Date();
        for(int i = 0; i < 10000; i++){
            list.remove(0);
        }

        Date end = new Date();

        long diff = end.getTime() - begin.getTime();

        System.out.println("REMOVE TIME(ms): " + diff);

    }
}
