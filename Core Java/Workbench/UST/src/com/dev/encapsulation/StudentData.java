package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s=new Student();
		s.setRegno(2015001);
		s.setName("Syeda");
		s.setEmail("syeda12@gmail.com");
		s.setPassword("12345");
		
		System.out.println("Regno: "+s.getRegno());
		System.out.println("Name: "+s.getName());
		System.out.println("Email: "+s.getEmail());
		System.out.println("************************");

	}

}
