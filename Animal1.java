package com.oop2.inheritence;

public class Animal1 {
		
		public void eat() {
			System.out.println("I can eat");
		}

	}
	 class Dog1 extends Animal1{
			
			public void bark() {
				System.out.println("barking");
			}

		}
		 class Babydog extends Dog1{
				
				public void weep() {
					System.out.println("weeping...");
				}

			}



	 
