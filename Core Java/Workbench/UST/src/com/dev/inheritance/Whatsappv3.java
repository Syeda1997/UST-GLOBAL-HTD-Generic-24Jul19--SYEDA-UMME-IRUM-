package com.dev.inheritance;

public class Whatsappv3 extends Whatsappv2 {
	static Whatsappv3 v3=new Whatsappv3();
	String mes4="blue tick";
	public static void main(String[] args) {
		v3.Printmes();
	}
	public void Printmes() {
		System.out.println(super.mes3+" "+mes4);
	}

}
