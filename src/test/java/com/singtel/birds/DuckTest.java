package com.singtel.birds;

import org.junit.Assert;
import org.junit.Test;

public class DuckTest {


	@Test
	public void swimTest(){
		BirdTQualities birdQualities = new Duck();
		Assert.assertTrue(birdQualities.isBirdCanSwim());
	}
	
	@Test
	public void  flyTest(){
		BirdTQualities birdQualities = new Duck();
		Assert.assertNull(birdQualities.isBirdCanfly());
	}
	
	@Test
	public void  voiceTest(){
		BirdTQualities birdQualities = new Duck();
		Assert.assertEquals(birdQualities.voice(), "Quack, quack");
	}
	
}
