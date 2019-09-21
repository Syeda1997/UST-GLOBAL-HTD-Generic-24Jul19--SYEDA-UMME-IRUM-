package com.dev.collections;

import java.util.HashSet;

public class Empimp implements EmpInt {

	HashSet<Employees> hs=new HashSet<Employees>();

	@Override
	public boolean addEmp(Employees emp) {
		if(emp!=null) {
			hs.add(emp);
		}
		System.out.println(hs);
		return false;
	}

	@Override
	public void getEmp() {
		System.out.println(hs);
		
	}

	@Override
	public boolean removeEmp(Employees emp) {
		return hs.remove(emp);
	}

	@Override
	public boolean containEmp(Employees emp) {
		return hs.contains(emp);
	}

	public boolean getLeave(Employees emp) {
		System.out.println(emp.getLeave());
		return false;
	}

}
