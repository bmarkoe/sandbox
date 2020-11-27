package com.fsi.sandbox;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest 
    extends TestCase
{
    
    public void testMethod() {
    	String val = HelloWorld.getVal();
    	assertEquals("Hello World!", val);
    }
}
