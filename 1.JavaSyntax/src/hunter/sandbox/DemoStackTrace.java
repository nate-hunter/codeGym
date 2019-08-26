package hunter.sandbox;

import java.util.Arrays;

public class DemoStackTrace {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        method2();
    }

    public static void method2(){
        method3();
    }

    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(Arrays.toString(stackTraceElements));

        System.out.println("\nEACH STACK ELEMENT:\n-------------------");
        for (StackTraceElement element : stackTraceElements){
            System.out.println(element);
            System.out.println("    METHOD NAME: " + element.getMethodName());
        }
    }
}
