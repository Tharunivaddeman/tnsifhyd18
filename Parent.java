package com.si.sample;//static method overriding


    class Parent {
		static void display()
		{
			System.out.println("class parent contents");
		}
	}
	class Child extends Parent
	{
		static void display()
		{
			System.out.println("class child contents");
		}
	}


