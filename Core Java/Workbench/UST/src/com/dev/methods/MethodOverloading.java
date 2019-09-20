package com.dev.methods;

public class MethodOverloading {
	
	static  MethodOverloading mo=new  MethodOverloading();
	public void print() {
		System.out.println("This is print method with no arg");
	}
	private int print(int i) {
		System.out.println("This is print method of int arg");
		return 1;
	}
	static String print(String str) {
		System.out.println("This is print method with string arg");
		return "a";
	}
	final int print(int d,int e) {
		System.out.println("The final method");
		return 1;
	}

	public static void main(String[] args) {
		mo.print(1);
	}

}
