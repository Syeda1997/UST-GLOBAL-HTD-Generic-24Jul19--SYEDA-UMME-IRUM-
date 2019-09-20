package com.dev.assignment;

public class RevStr {

	public static void main(String[] args) {
		String st="Java";
		String str="";
		System.out.println("Original String: " +st);
		for(int i=st.length()-1;i>=0;i--) {
			str+=st.charAt(i);
		}
		System.out.println("Reverse of String: "+str);
	}

}
