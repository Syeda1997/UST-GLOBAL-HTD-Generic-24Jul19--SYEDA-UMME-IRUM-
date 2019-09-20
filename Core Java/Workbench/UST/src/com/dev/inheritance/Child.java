package com.dev.inheritance;

public class Child extends Parent{
	static Child c=new Child();
	
	public static void main(String[] args) {
		c.printstr();

	}
	@Override
	public void printstr() {
		System.out.println("overriding method");
	}

}
