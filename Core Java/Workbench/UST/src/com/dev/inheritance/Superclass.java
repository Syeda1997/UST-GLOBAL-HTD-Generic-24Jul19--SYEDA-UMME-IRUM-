package com.dev.inheritance;

public class Superclass {
		public Superclass() {
			System.out.println("const with no arg");
		}
		public Superclass(int i) {
			System.out.println("const with int arg");
		}
		public Superclass(String s,int i) {
			System.out.println("const with str and int arg");
		}
		public Superclass(int i,String s) {
			System.out.println("const with int and str arg");
		}

}
