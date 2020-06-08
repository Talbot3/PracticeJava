package lib_talbot3.utils;

import com.google.common.base.*;
import java.util.List;
import java.util.function.Predicate;

public class Inspect {

    public static<E> void print(E[] arr) {
        System.out.println("=======================Print Array=======================");
        for (E ele: arr) {
            System.out.printf("%s ", Optional.fromNullable(ele).orNull());
        }
    }

    public static<E> void print(List<E> list) {
        System.out.println("=======================Print List=======================");
        list.forEach(item -> System.out.print(item + " "));
        System.out.println("\n=======================Print List=======================");
    }

    public static<E> void printFilter(E[] arr, Predicate<E> predicate) {
        for (E ele: arr) {
            if (predicate.test(ele)) {
                System.out.printf("%s ", Optional.fromNullable(ele).orNull());
            }
        }
    }

    public static<E> void printFilter(List<E> arr, Predicate<E> predicate) {
       arr.forEach(ele->{
            if (predicate.test(ele)) {
                System.out.printf("%s ", Optional.fromNullable(ele).orNull());
            }
       });
    }
}