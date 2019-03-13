package com.first.app;

public class SomethingElse {
	  public static void main(String[] args) {
		  String s = new String();
		    System.out.println(s.getClass()); //working
		    System.out.println(String.class.getClass()); //Failing, pointless to call getClass on class Object
		  }
}
