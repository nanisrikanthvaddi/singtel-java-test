package com.singtel.birds;

import org.junit.Assert;
import org.junit.Test;

public class ParrotLivingTest {
	
	
	@Test
	public void voiceTestForNearRooster(){
		LivingQualities qualities= new ParrotNearRooster();
		Assert.assertEquals(qualities.says(), "Cock-a-doodle-doo");
		
	}
	
	@Test
	public void voiceTestwihtCats(){
		LivingQualities qualities= new ParrotWithCats();
		Assert.assertEquals(qualities.says(), "Meow");
		
	}
	
	@Test
	public void voiceTestwihtDogs(){
		LivingQualities qualities= new ParrotWithDogs();
		Assert.assertEquals(qualities.says(), "Woof, woof");
		
	}

}
