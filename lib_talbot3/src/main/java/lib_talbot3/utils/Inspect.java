package lib_talbot3.utils;

public class Inspect {

    public static<E> void printArray(E[] arr) {
        System.out.println("=======================print array=======================");
        for (E ele: arr) {
            System.out.printf("%s ", ele);
        }
        System.out.println("\n=======================print array=======================");
    }
}