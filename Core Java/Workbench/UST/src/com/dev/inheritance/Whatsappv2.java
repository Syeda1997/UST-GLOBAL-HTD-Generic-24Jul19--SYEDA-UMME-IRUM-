package com.dev.inheritance;

public class Whatsappv2 extends Whatsappv1{
	static Whatsappv2 v2=new Whatsappv2();
	String mes3="double tick";
	public static void main(String[] args) {
		v2.Printmes();

	}
	public void Printmes() {
		System.out.println(super.mes+" "+mes3+" "+super.mes1);
	}

}
