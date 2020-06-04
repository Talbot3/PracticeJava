package lib_talbot3.utils;

import com.google.common.base.*;

public class Inspect {

    public static<E> void printArray(E[] arr) {
        System.out.println("=======================print array=======================");
        for (E ele: arr) {
            System.out.printf("%s ", Optional.fromNullable(ele).orNull());
        }
        System.out.println("\n=======================print array=======================");
    }
}