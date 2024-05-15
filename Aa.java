package com.si.sample;//nstance method overriding

public class Aa {
	public void display()
	{
		System.out.println("cls A contents");
	}
}
class B extends Aa
{
	public void display()
	{
		System.out.println("class B contents");
	}
}
