package com.dev.collections;

import java.util.Scanner;

public class Empdata extends Empimp {

	public static void main(String[] args) {

		Empimp ei = new Empimp();
		Employees e = new Employees();
		e.setEmail("syeda@gmail.com");
		e.setEmployee_id(101);
		e.setEmployee_name("Syeda");
		e.setEmployee_type("manager");
		e.setPassword("Syeda123");
		e.setLeave("Mon 21st oct");
		e.setLeave_Status("reject");

		Employees e1 = new Employees();
		e1.setEmail("tina@gmail.com");
		e1.setEmployee_id(102);
		e1.setEmployee_name("tina");
		e1.setEmployee_type("tester");
		e1.setPassword("tina123");
		e1.setLeave("tuesday 2nd march");
		e1.setLeave_Status("Approved");

		System.out.println("Employee details");
		boolean s = ei.addEmp(e);
		boolean s1 = ei.addEmp(e1);
		System.out.println("===============================");

		ei.getEmp();

		boolean b1 = ei.removeEmp(e1);
		System.out.println("Employee removed:" + b1);

		boolean b = ei.containEmp(e);
		System.out.println("Contains employee:" + b);
		
		System.out.println("================================");

		System.out.println("Press 1 to register:");
		System.out.println("Press 2 to login:");
		Scanner r = new Scanner(System.in);
		int ch = r.nextInt();
		switch (ch) {

		case 1:
			System.out.println("Employee_ID:");
			r.nextInt();
			System.out.println("Employee_Name:");
			r.next();
			System.out.println("Email:");
			r.next();
			System.out.println("password:");
			r.next();
			System.out.println("leavedate:");
			r.next();
			break;
		case 2:
			System.out.println("Enter Username or email:");
			r.next();
			System.out.println("Enter password:");
			r.next();
			break;
		default:
			System.out.println("invalid");
		}
		
		System.out.println("=====================================");
		if(e.getEmployee_type()=="manager") {
			System.out.println("MANAGER LOGIN");
			System.out.println("Press 1 to view leave request");
			System.out.println("Press 2 to approve or reject request");
			Scanner st=new Scanner(System.in);
			int ch1=st.nextInt();
			switch(ch1) {
			
			case 1:System.out.print(ei.getLeave(e));
			break;
			case 2:System.out.println(e1.getLeave_Status());
			break;
			default:System.out.println("invalid");
			} 
		} else {
			System.out.println("EMPLOYEE LOGIN");
			System.out.println("Press 1 to view leave request");
			System.out.println("Press 2 to leave");
			Scanner sc=new Scanner(System.in);
			int ch2=sc.nextInt();
			switch(ch2) {
			case 1: System.out.println(e.getLeave());
			break;
			case 2 : System.out.println(e.getLeave_Status());
			break;
			default:System.out.println("invalid choice");
			}
		}
	}
}