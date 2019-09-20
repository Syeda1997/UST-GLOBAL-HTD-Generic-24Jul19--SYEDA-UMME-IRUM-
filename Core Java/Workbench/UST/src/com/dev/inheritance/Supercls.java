package com.dev.inheritance;

public class Supercls {
	public Supercls() {
		System.out.println("const with no arg");
	}
	public Supercls(int i) {
		System.out.println("const with int arg");
	}
	public Supercls(String s,int i) {
		System.out.println("const with str and int arg");
	}
	public Supercls(int i,String s) {
		System.out.println("const with int and str arg");
	}
}
