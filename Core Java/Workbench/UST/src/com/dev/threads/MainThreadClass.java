package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("Main thread starts...");
		System.out.println("Main class prints value of i");
		
//		new T2().start(); 
		Thread2 t1=new Thread2();
		t1.setName("Thread2");
		t1.setPriority(2);
		t1.start();
		
		Thread.currentThread().setName("Main Thread");
		Thread.currentThread().setPriority(1);
		
		new Thread(new Thread3()).start();
		
		Thread3 t3 =new Thread3();
		Thread t =new Thread(t3);
		t.setPriority(3);
		t.start();
		
		for(int i=1; i<=10; i++) {
			System.out.println("i = " +i);
		}
		System.out.println("Thread Name1: "+Thread.currentThread().getName());
		System.out.println("Thread Name2: "+t1.getName());
		System.out.println("Thread2 id: " +t1.getId());
		System.out.println("Thread3 id: " +t.getId());
		System.out.println("Thread1 id: "+Thread.currentThread().getId());
		System.out.println("Thread2 priority: " +t1.getPriority());
		System.out.println("Thread3 priority: " +t.getPriority());
		System.out.println("Thread1 priority: " +Thread.currentThread().getPriority());
		System.out.println("Main thread Ends...");
	}

}
