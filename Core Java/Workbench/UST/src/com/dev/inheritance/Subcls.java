package com.dev.inheritance;

public class Subcls extends Supercls {
	public Subcls() {
		super();
	}
	public Subcls(int i) {
		super(1);
	}
	public Subcls(String s,int i) {
		super("a",1);
	}
	public Subcls(int i,String s) {
		super(1,"b");
 
	}
	public static void main(String[] args) {
		Subcls s1=new Subcls();
		Subcls s2=new Subcls(1);
		Subcls s3=new Subcls("a",2);
		Subcls s4=new Subcls(3,"b");
		
	}

}
