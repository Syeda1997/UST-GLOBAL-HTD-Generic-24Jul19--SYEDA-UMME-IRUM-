package com.dev.test;

import java.util.HashMap;

public class ImpInt implements EmpInt{
	
	HashMap<String,Employee> hm=new HashMap<String,Employee>();

	@Override
	public Employee insertEmp(String k, Employee e) {
		if(e!=null) {
			System.out.println("Inserting the employees");
			hm.put("1", e);
			System.out.println(hm);
		}
		return null;
	}

	@Override
	public void searchEmp() {
		System.out.println("Searching the employee");
		System.out.println(hm.get(1));
		System.out.println(hm);
	}

	@Override
	public Employee removeEmp(String k, Employee e) {
		System.out.println("Removing data:");
		hm.remove(1);
		System.out.println(hm);
		return e;
	}

	@Override
	public Employee updateEmp(String k, Employee e) {
		
		return null;
	}

	
}
