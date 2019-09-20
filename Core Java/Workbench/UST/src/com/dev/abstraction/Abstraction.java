package com.dev.abstraction;

public class Abstraction extends AbstractEx {
	public Abstraction() {
		System.out.println("const of abstraction class");
	}
	
	@Override
	void display() {
		System.out.println("This is implemented method of abstract class");
	}
	public static void main(String[] args) {
		Abstraction a=new Abstraction();
		a.display();
		a.show();
	}
}
