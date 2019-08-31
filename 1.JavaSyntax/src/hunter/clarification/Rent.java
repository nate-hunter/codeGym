package hunter.clarification;

public class Rent {

    public static void main(String[] args) {

//        int credit = 985;

        int currentRent = 1945;

        int originalRent = 1925;
        int onFile = originalRent*3;            // deposit + first + last

        int fee = 200;                          // cleaning
        int newRent = 2295;
        int newSecDep = newRent * 2;
        int due = newSecDep + fee;              // $4790
        int credit = onFile - due;              // should be $985
        System.out.println(originalRent*2 - newSecDep);
    }

}
