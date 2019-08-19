package sandbox;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args){
//        ArrayList arr = new ArrayList();
//
//        int n = 3;
//        arr.add(n + 1);
//        arr.add("yo");
//
//        System.out.println(arr.toString());
//
//        int t = Integer.parseInt(arr.get(0).toString());
//        System.out.println(t + 4);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size(); ) { // We moved the statement that increases i to inside the loop
            System.out.println("i: " + i);
            System.out.println(list.toString());
            if (list.get(i) > 5)
                list.remove(i);  // Don’t increase i if we deleted the current element
            else
                i++;
                System.out.println("+");
        }

        System.out.println(list.toString());
    }
}
