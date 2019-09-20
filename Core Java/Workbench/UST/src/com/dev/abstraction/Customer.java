package com.dev.abstraction;

public abstract class Customer extends User {
	
	
	@Override
	void login() {
		System.out.println("Customer Login");
	}
//	@Override
//	void logout() {
//		System.out.println("Customer Logout");
//	}
}
