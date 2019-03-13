/*package com.first.app;

import org.junit.rules.ExpectedException;

import com.google.errorprone.annotations.CheckReturnValue;
public class CheckReturnValuePositive {
	
	//IntValue intValue = new IntValue(0);

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

	  public void bar() {
	    // BUG: Diagnostic contains: this.intValue = this.intValue.increment()
	    this.intValue.increment();
	  }

	  public void testIntValue() {
	    IntValue value = new IntValue(10);
	    // BUG: Diagnostic contains: value = value.increment()
	    value.increment();
	  }

	  private void callRunnable(Runnable runnable) {
	    runnable.run();
	  }

	  public void testResolvedToVoidLambda() {
	    // BUG: Diagnostic contains: Ignored return value
	    callRunnable((Runnable) this.intValue.increment());
	  }


	  public void testBeforeAndAfterRule() {
	    // BUG: Diagnostic contains: remove this line
	    new IntValue(1).increment();
	    ExpectedException.none().expect(IllegalStateException.class);
	    new IntValue(1).increment(); // No error here, last statement in block
	  }

	  public void constructor() {
	    
	     *//** We may or may not want to treat this as a bug. On the one hand, the
	     * subclass might be "using" the superclass, so it might not be being
	     * "ignored." (Plus, it would be a pain to produce a valid suggested fix
	     * that incorporates any subclass constructor body, which might even contain
	     * calls to methods in the class.) On the other hand, the more likely
	     * scenario may be a class like IteratorTester, which requires (a) that the
	     * user subclass it to implement a method and (b) that the user call test()
	     * on the constructed object. There, it would be nice if IteratorTester
	     * could be annotated with @CheckReturnValue to mean "anyone who creates an
	     * anonymous subclasses of this should still do something with that
	     * subclass." But perhaps that's an abuse of @CheckForNull.
	     *
	     * Anyway, these tests are here to ensure that subclasses don't don't crash
	     * the compiler.*//*
	     
	    new MyObject() {};

	    // TODO(cpovirk): This one probably ought to be treated as a bug:
	    new MyObject();
	  }

	  private class IntValue {
	    final int i;

	    public IntValue(int i) {
	      this.i = i;
	    }

	    @javax.annotation.CheckReturnValue
	    public IntValue increment() {
	      return new IntValue(i + 1);
	    }
	  }

	  private static class MyObject {
	    @CheckReturnValue
	    MyObject() {}
	  }

	  private abstract static class LB1<A> {}

	  private static class LB2<A> extends LB1<A> {

	    @CheckReturnValue
	    public static <T> LB2<T> lb1() {
	      return new LB2<T>();
	    }
	  }

}
*/