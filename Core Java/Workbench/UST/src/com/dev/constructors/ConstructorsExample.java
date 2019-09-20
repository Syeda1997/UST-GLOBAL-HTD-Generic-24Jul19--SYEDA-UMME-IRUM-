package com.dev.constructors;

public class ConstructorsExample {
	
	public ConstructorsExample() {
		System.out.println("this is no arg constructor");
	}
	public ConstructorsExample(int i) {
		System.out.println("the const is with int arg");
	}
	public ConstructorsExample(String s) {
	System.out.println("this const is with string arg");
		
	}
	public ConstructorsExample(String s,int i) {
		System.out.println("the const with two different arg");
	}
	public ConstructorsExample(int i,String s) {
		System.out.println("the const with two different arg with different order");
	}
	public static void main(String[] args) {
		ConstructorsExample ce=new ConstructorsExample();
		ConstructorsExample ce1=new ConstructorsExample(1);
		ConstructorsExample ce2=new ConstructorsExample("A");
		ConstructorsExample ce3=new ConstructorsExample("b",7);
		ConstructorsExample ce4=new ConstructorsExample(8,"A");
		
	}
}
