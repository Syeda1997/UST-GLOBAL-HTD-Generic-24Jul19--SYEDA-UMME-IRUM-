package com.dev.polymorphism;

public class RunTime {
	static RunTime r=new RunTime();
	String attend="Present";
	String subject="Java";
	public static void main(String[] args) {
		r.print();
	}
	public void print() {
		System.out.println(attend+" "+subject);
	}

}
