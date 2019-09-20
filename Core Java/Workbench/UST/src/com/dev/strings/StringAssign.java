package com.dev.strings;

public class StringAssign {

	public static void main(String[] args) {
		String str="Hey!!!!";
		String str1="hello!!!!";
		String str2="hello!!!!";
		int len=str1.length();
		System.out.println(len);
		
		char[] ch=str1.toCharArray();
		System.out.println(ch[2]);
		
		char c=str1.charAt(4);
		System.out.println(c);
		
		boolean b=str2.equals(str1);
		System.out.println(b);
		
		boolean b1=str.equalsIgnoreCase(str1);
		System.out.println(b1);

		boolean b2=str.contains("He");
		System.out.println(b2);
		
		String s=str.replace('e', 'I');
		System.out.println(s);
		
		int s1=str1.indexOf('l');
		System.out.println(s1);
		
		String s3=str.toUpperCase();
		System.out.println(s3);
		
		String s4=s3.toLowerCase();
		System.out.println(s4);
		
		String s5=str1.substring(3);
		System.out.println(s5);
		
		String s6=str2.substring(2, 5);
		System.out.println(s6);
	}

}
