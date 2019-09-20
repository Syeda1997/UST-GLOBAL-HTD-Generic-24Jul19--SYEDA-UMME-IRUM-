package com.dev.abstraction;

public class CustomerChild extends Customer{ 
	

	public static void main(String[] args) {
		CustomerChild c=new CustomerChild();
		c.show();
		c.login();
		c.logout();
		
	}


	@Override
	void logout() {
		System.out.println("Customer logout");
		
	}
}
