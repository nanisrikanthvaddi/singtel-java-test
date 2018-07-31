package com.singtel.birds;

import com.singtel.test.Bird;

public class Duck extends Bird implements BirdTQualities {
 
	public String voice(){
		return "Quack, quack";
	}

	public Boolean isBirdCanSwim() {
		return true;
	}

	public Boolean isBirdCanfly() {
		// TODO Auto-generated method stub
		return null;
	}
	
}