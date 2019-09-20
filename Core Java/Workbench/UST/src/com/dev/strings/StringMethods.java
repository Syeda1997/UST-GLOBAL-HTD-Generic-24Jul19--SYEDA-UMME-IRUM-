package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str="Hai!!!!";
		String str1="hai!!!!";
		int len=str.length();
		System.out.println(len);
		
		char[] ch=str.toCharArray();
		System.out.println(ch[2]);
		
		char c=str.charAt(5);
		System.out.println(c);
		
		boolean b=str.equals(str1);
		System.out.println(b);
		
		boolean b1=str.equalsIgnoreCase(str1);
		System.out.println(b1);
	}

}
