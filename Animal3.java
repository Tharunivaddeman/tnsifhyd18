package com.oop2.inheritence;

public class Animal3 {
	
	public void eat() {
		System.out.println("I can eat");
	}

}
 class Dog3 extends Animal3{
		
		public void bark() {
			System.out.println("barking");
		}

	}
	 class Cat3 extends Dog3{
			
			public void meow() {
				System.out.println("meowing");
			}
	 }
	 class Rat3 extends Animal3{
			
			public void run() {
				System.out.println("running");
			}
			

}
