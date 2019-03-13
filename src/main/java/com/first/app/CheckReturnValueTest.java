/*package com.first.app;

import com.google.errorprone.annotations.CheckReturnValue;

public class CheckReturnValueTest {
	
	@CheckReturnValue
	  private int increment(int bar) { // The return value must be used in the function which calls increment function
	    return bar + 1;
	  }

	  public void foo() {
	    int i = 1;
	    // BUG: Diagnostic contains: remove this line
	    increment(i); //failing, the return value is not used
	    System.out.println(i);
	  }
	  
	  public void fooPass() {
		    int i = 1;
		    int used = increment(i); // Pass, return value is used
		    System.out.println(used);
		  }

}
*/