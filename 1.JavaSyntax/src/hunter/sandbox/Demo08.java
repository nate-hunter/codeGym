package hunter.sandbox;

import java.util.Date;

public class Demo08 {

    public static void main(String[] args) throws InterruptedException {
        Date today = new Date();
        System.out.println("DATE: " + today);

        Date currentTime = new Date();
//        Thread.sleep(3000);
        Date newTime = new Date();

        long diff = newTime.getTime() - currentTime.getTime();

//        System.out.println("DIFFERENCE: " + diff);

        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();

        String ct = currentTime.toString();
        System.out.println(hours + ":" + mins);
    }
}
