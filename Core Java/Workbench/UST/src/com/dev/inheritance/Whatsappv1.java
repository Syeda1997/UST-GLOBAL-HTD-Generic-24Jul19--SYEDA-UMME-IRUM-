package com.dev.inheritance;

public class Whatsappv1 {
	static Whatsappv1 v1=new Whatsappv1(); 
	String mes="one tick";
	String mes1="delivered";
	public static void main(String[] args) {
		v1.Printmes();

	}
	public void Printmes() {
		System.out.println(mes+" "+mes1);
	}
}
