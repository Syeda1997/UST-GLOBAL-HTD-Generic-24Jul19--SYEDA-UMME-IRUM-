package com.dev.polymorphism;

public class CompileTime extends RunTime {
	static CompileTime c=new CompileTime();
	String attend="absent";
	public static void main(String[] args) {
		c.print();
		c.print(1);
		
	}
	@Override
	public void print() {
		
		System.out.println(c.attend+" "+r.subject);
	}
	public int print(int i) {
		System.out.println(r.attend+" "+i+" "+c.attend+" "+i);
		return i;
	}

}
