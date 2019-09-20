package com.dev.methods;

public class ArithmeticOperators {
	static ArithmeticOperators a=new ArithmeticOperators();

	//Addition
	public int add(int a1,int a2,int a3,int a4) {
		int sum=a1+a2+a3+a4;
		return sum;
	}
	public int add(int a1,int a2) {
		int sum1=a1+a2;
		return sum1;
	}
	public float add(int a1,float a2,int a3) {
		float sum2=a1+a2+a3;
		return sum2;
	}
	//subtraction
	public float add(int a1,int a2,float a3) {
		float sub=a1-a2;
		return sub;
	}
	public double add(int a1,double a2,int a3) {
		double sub1=a1-a2;
		return sub1;
	}
	public int add(int a1,int a2,int a3) {
		int sub2=a1-a2-a3;
		return sub2;
	}
	
	//multiplication
	
	public float add(float a1,int a2) {
		float mul=a1*a2;
		return mul;
	}
	public float add(int a1,float a2,float a3) {
		float mul=a1*a2*a3;
		return mul;
	}
	public double add(float a1,float a2,float a3,double a4) {
		double mul=a1*a2*a3*a4;
		return mul;
	}
	
	//division
	
	public double add(double a1,int a2) {
		double div=a1/a2;
		return div;
	}
	public float add(int a1,float a2) {
		float div=a1/a2;
		return div;
	}
	public double add(int a1,double a2) {
		double div=a1/a2;
		return div;
	}
	
	public static void main(String[] args) {
		int addition=a.add(4, 2, 4, 6);
		double subtraction=a.add(8, 2,9.2f);
		int multiplication=a.add(6, 2, 3);
		int division=a.add(78, 2);
		System.out.println("The total is: " +addition);
		System.out.println("The difference is: " +subtraction);
		System.out.println("The multiplied value is: " +multiplication);
		System.out.println("The quotient is: " +division);
		

	}

}
