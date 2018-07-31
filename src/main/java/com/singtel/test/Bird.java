package com.singtel.test;

class Bird extends Animal {
	 
	void fly() {
		System.out.println("I am flying");
	}
	
	@Override
	void walk(){
		 System.out.println("I am walking");
		 }
	
	void sing(){
		 System.out.println("I am singing");
		 }
}