/*package com.first.app;

public class ComparisonOutOfRange {
	
	public class ComparisonOutOfRangePositiveCases {

		  public void testByteEquality() {
		    boolean result;
		    byte b = 0;

		    // BUG: Diagnostic contains: b == -1
		    result = b == 1000; // Will always fail because it is out of range.
		    // BUG: Diagnostic contains: b == 1
		    result = b == -255; //failing
		    // BUG: Diagnostic contains: b == -128
		    result = b == 127; //Pass

		  }
	}
}
*/