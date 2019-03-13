/*package com.first.app;

import com.google.common.base.Objects;
import java.util.Arrays;

public class ArrayEqualsPositiveCases {

  public void intArray() {
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};

    // Right One
    if (Arrays.equals(a, b)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }

    if (a == b){	
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void objectArray() {
    Object[] a = new Object[3];
    Object[] b = new Object[3];

    // BUG: Diagnostic contains: Arrays.equals(a, b)
    if (Objects.equal(a, b)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
    
    if (a.equals(b)) {
        System.out.println("arrays are equal!");
      } else {
        System.out.println("arrays are not equal!");
      }
  }

  public void bothMethodCalls() {
    String s1 = "hello";
    String s2 = "world";

    // BUG: Diagnostic contains: Arrays.equals(s1.toCharArray(), s2.toCharArray())
    if (s1.toCharArray().equals(s2.toCharArray())) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }
}*/