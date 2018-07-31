package com.singtel.birds;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {


	@Test
	public void swimTest(){
		BirdTQualities birdQualities = new Chicken();
		Assert.assertNull(birdQualities.isBirdCanSwim());
	}
	
	@Test
	public void  flyTest(){
		BirdTQualities birdQualities = new Chicken();
		Assert.assertFalse(birdQualities.isBirdCanfly());
	}
	
	@Test
	public void  voiceTest(){
		BirdTQualities birdQualities = new Chicken();
		Assert.assertEquals(birdQualities.voice(), "Cluck, cluck");
	}
	
}
