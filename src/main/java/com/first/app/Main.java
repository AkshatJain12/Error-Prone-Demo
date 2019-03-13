package com.first.app;

import com.google.errorprone.annotations.CheckReturnValue;



public class Main {
	
	
	 public static void main(String[] args) {
		    // Dead exception
		 	//throw new RuntimeException(); //working fine
		    //new RuntimeException(); // Dead Exception example, if we forget throw
		 
		 
		 /*
		    Set<Short> s = new HashSet<>();
		    for (short i = 0; i < 100; i++) {
		      s.add(i);
		      s.remove(i-1); // We are trying to subtract two numbers of different data types
		    }*/
		    
		    /*public void setNameFormat(String nameFormat) {
		    	  String unused = format(nameFormat, 0); // fail fast if the format is bad or null
		    	  this.nameFormat = nameFormat;
		    	}*/
		 
		 
		  }
}
