package com.dev.constructors;

import com.dev.methods.MethodExample;

public class ConstructorEx {
	public ConstructorEx() {
		System.out.println("constructor with no arg");
		//System.out.println(c);shows error
	}
	public ConstructorEx(int j) {
		System.out.println("constructor with int arg");
		//System.out.println(c1);
	}
	public ConstructorEx(int j, String s) {
		System.out.println("constructor with two arg");
		//System.out.println(c2);
	}
	public ConstructorEx(double s, int k) {
		System.out.println("constructor with two arg changing order of sequence");
		//System.out.println(c3);
	}
	public static void main(String[] args) {
		
		int i=MethodExample.calcArea(6);
		System.out.println(i);
		ConstructorEx c=new ConstructorEx();
		ConstructorEx c1=new ConstructorEx(2);
		ConstructorEx c2=new ConstructorEx(33,"r");
		ConstructorEx c3=new ConstructorEx(4.4,3);
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
