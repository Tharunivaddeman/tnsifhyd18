package com.si.sample;//instance,static variables in 1 class

class A
{
	int a=10;
	static String b="tharuniv"
	void display()
	{
		System.out.println("hii");
	}
	static String display1()
	{
		return "vt";
	}
	public static void main(String[] args) {
		int c=30;
		System.out.println(c);
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(b);
		a1.display();
		System.out.println(A.display1());
	}
}
