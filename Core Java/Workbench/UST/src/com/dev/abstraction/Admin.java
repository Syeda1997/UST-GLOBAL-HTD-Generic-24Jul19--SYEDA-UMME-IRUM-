package com.dev.abstraction;

public class Admin extends User {
	
	@Override
	void login() {
		System.out.println("Admin login");
	}
	@Override
	void logout() {
		System.out.println("Admin logout");
	}
	public static void main(String[] args) {
		Admin a=new Admin();
		a.login();
		a.logout();
	}
}
 