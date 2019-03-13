/*package com.first.app;

public class EqualsReference {
	

	  class FinalObject {
	    @Override
	    // BUG: Diagnostic contains: ==
	    public boolean equals(final Object object) { //Failing, infinite recursion occurs
	      return this.equals(object);
	    }
	  }

	  class NoThis {
	    @Override
	    // BUG: Diagnostic contains: ==
	    public boolean equals(Object o) { //Failing, infinite recursion occurs
	      return equals(o);
	    }
	  }
	  
	  class PassThis {
		    // BUG: Diagnostic contains: ==
		    public boolean equalsPass(Object o) { 
		      return this==o; //Pass
		    }
		  }

}
*/