/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.practice.talbot3;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import lib_talbot3.utils.Inspect;
import lib_talbot3.utils.StringHelper;

public class App {
   public String getGreeting() {
      return "hello world";
   }

   public static void main(String args[]) throws UnsupportedEncodingException {


      Integer[] intArr = {1,2,3,4,5, null};
      Inspect.print(intArr);

      String test = StringHelper.encode2Base64("hello world");
      System.out.println(test);
      String encodeStr = StringHelper.decoderBase64(test);
      System.out.println(encodeStr);

      String[] testArr = StringHelper.sort("aaAA", "bb", "cc", "dd", "ee");
      Inspect.print(testArr);

      Function<Integer, Integer> fn = f -> f * 100;
      BiFunction<Integer, Integer, Integer> mathOp = (a,b)->a*b;
      System.out.println(fn.apply(20));
      System.out.println( mathOp.apply(20, 30));

      List<Integer> list = Arrays.asList(2,1,4,3);
      Inspect.print(list);
      Inspect.printFilter(list, item -> item >= 3);

   }
}
