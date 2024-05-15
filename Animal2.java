package com.oop2.inheritence;

public class Animal2 {
		public void eat() {
			System.out.println("I can eat");
		}

	}
	 class Dog2 extends Animal2{
			
			public void bark() {
				System.out.println("barking");
			}

		}
		 class Cat extends Animal2{
				
				public void meow() {
					System.out.println("meowing");
				}

			}

