package com.singtel.birds;

import org.junit.Assert;
import org.junit.Test;

public class RoosterTest {


	@Test
	public void swimTest(){
		BirdTQualities birdQualities = new Rooster();
		Assert.assertNull(birdQualities.isBirdCanSwim());
	}
	
	@Test
	public void  flyTest(){
		BirdTQualities birdQualities = new Rooster();
		Assert.assertNull(birdQualities.isBirdCanfly());
	}
	
	@Test
	public void  voiceTest(){
		BirdTQualities birdQualities = new Rooster();
		Assert.assertEquals(birdQualities.voice(), "Cock-a-doodle-doo");
	}
	
}
