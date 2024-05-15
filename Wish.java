package com.si.sample;//methods in 1 class and accessing in other class

public class Wish {
		 public static void main(String[] args) {
			int v=14;
			System.out.println(v);
			Approach2 a1=new Approach2();
			System.out.println(a1.a);
			Approach2.display(); 
			System.out.println(Approach2.b);
			System.out.println(Approach2.c);
	   	    a1.display1();  
	 		
		}
	 }

    