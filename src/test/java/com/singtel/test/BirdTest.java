package com.singtel.test;

import org.junit.Test;
 

public class BirdTest {
	
@Test(expected = Test.None.class)
public void testSingMethodAvaialble(){
	Bird b = new Bird();
	b.sing();
}
	
@Test(expected = Test.None.class)
public void testflyMethodAvaialble(){
	Bird b = new Bird();
	b.fly();
}

@Test(expected = Test.None.class)
public void testwalkMethodAvaialble(){
	Bird b = new Bird();
	b.walk();
}
	
	

}
