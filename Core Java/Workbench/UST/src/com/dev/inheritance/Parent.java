package com.dev.inheritance;

public class Parent {
	static Parent p=new Parent();
	String s="parent";
	public static void main(String[] args) {
		p.printstr();
	}
	//private void printstr() private methods cannot be overridden
	//final void printstr() { final methods cannot be overridden
	//public static void printstr() { static methods cannot be overridden but can be implemented without annotation @override
	public void printstr() {
		System.out.println(s);
	}

}
