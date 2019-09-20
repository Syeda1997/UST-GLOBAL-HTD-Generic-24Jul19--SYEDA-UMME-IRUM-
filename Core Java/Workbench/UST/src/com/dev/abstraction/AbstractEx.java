package com.dev.abstraction;

public abstract class AbstractEx {

		public AbstractEx() {
			System.out.println("constructor of abstract class");
		}
		abstract void display();
		
		public void show() {
			System.out.println("concrete method of abstract class");
		}
}
