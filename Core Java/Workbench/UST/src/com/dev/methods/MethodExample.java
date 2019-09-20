package com.dev.methods;

public class MethodExample {
	
	static int j=0;
	static MethodExample me=new MethodExample();
	public static void main(String[] args) {
		
		int are=calcArea(6);
		System.out.println("Area of Square:" +are);
		int ar=me.areaRec(2,3);
		System.out.println("Area of Rectangle:" +ar);
	}
	public static int calcArea(int side){
		int t=side*side;
		int n=me.areaRec(4, 7);
		System.out.println("Area of Rectangle: " +n);
		return t;
	}
	public int areaRec(int len,int wid) {
		j=len*wid;
		return j;
	}
}
