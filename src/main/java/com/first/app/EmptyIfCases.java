package com.first.app;

public class EmptyIfCases {

	  public static void positiveCase1() {
	    int i = 10;
	    // BUG: Diagnostic contains: if (i == 10) {
	    if (i == 10); {
	      i++;
	    }
	  }
}
