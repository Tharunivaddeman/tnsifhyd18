package com.si.sample;//instance,static methods overloading

public class M {
	public static void main(String[] args) {
		K k = new K();
		k.foo();
		k.foo(22);
		K.show();
		K.show(14);
		
	}

}
