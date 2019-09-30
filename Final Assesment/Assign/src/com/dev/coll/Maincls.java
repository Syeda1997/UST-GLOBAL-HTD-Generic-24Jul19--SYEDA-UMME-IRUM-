package com.dev.coll;

import java.util.HashSet;
import java.util.Scanner;

public class Maincls {

	public static void main(String[] args) {
		Conimp ci = new Conimp();
		HashSet<Contact> hs = new HashSet<Contact>();

		Scanner scr = new Scanner(System.in);

		Contact c1 = new Contact();
		c1.setName("syeda");
		c1.setNumber(6789654678l);
		c1.setGroup("group1");

		Contact c2 = new Contact();
		c2.setName("umme");
		c2.setNumber(667890654l);
		c2.setGroup("group2");

		Contact c3 = new Contact();
		c3.setName("irum");
		c3.setNumber(67895432l);
		c3.setGroup("group1");

		System.out.println("Press 1 to list all the contact");
		int bPress1 = scr.nextInt();

		if (bPress1 == 1) {
			ci.putData("1", c1);
			ci.putData("2", c2);
			ci.putData("3", c3);
			System.out.println(ci.hm);
		} else {
			System.out.println("Incorrect Option Selected!!!!! Press 1 to list all the contact");
		}
		
		System.out.println("Press 2 to search the contact");
		int bPress2 = scr.nextInt();
		if (bPress2 == 2) {
			ci.containsData("1", c2);
			System.out.println("Press 1 to call");
			int press1 = scr.nextInt();
			if (press1 == 1) {
				System.out.println("call");

			} else {
				System.out.println("invalid!!!");
			}

			System.out.println("Press 2 to message");
			int press2 = scr.nextInt();
			if (press2 == 2) {
				System.out.println("message");

			} else {
				System.out.println("invalid!!!");
			}

			System.out.println("Press 3 to go back to main menu");
			int press3 = scr.nextInt();
			if (press3 == 3) {
				System.out.println("back to menu");

			} else {
				System.out.println("invalid!!!");
			}
		} else {
			System.out.println("Invalid Option selected");
		}/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println("Press 3 to perform operation");
		int bPress3 = scr.nextInt();
		if (bPress3 == 3) {
			System.out.println("press 1 to add contact");
			int p1 = scr.nextInt();
			if (p1 == 1) {
				ci.putData("1", c1);
				ci.putData("2", c2);
				ci.putData("3", c3);

				System.out.println(ci.hm);
			} else {
				System.out.println("Invalid");
			}
			System.out.println("press 2 to delete contact");
			int p2 = scr.nextInt();
			if (p2 == 2) {
				System.out.println("Deleting Contacts");
				ci.removeData("2", c2);
				ci.removeData("3", c3);
				ci.removeData("4", c3);
				ci.removeData("5", c3);
				System.out.println(ci.hm);
			} else {
				System.out.println("Invalid");
			}
			System.out.println("press 3 to edit contact");
			int p3 = scr.nextInt();
			if (p3 == 3) {
				System.out.println("Editing Contacts");
				c1.setName("David");
				c1.setNumber(8899995599l);
				c1.setGroup("group-M");

		
				ci.putData("1", c1);
	
				System.out.println(ci.hm);

			} else {
				System.out.println("Invalid....");
			}
		} else {
			System.out.println("invalid!!!");
		}
	}

}
