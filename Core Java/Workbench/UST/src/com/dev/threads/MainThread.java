package com.dev.threads;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		Name1 n=new Name1();
		Thread55 t5=new Thread55(n);
		t5.start();
		t5.join();

	}

}
