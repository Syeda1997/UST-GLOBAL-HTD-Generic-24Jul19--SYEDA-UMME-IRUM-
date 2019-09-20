package com.dev.abstraction;

public abstract class User {

		abstract void login();
		abstract void logout();
		
		public void show() {
			System.out.println("Login Of User");
		}
	
}
