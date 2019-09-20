package com.dev.arrays;

public class CreatingArray2 {

	public static void main(String[] args) {
		int[] intArr=new int[5]; //declaration and creation of array in one line
		intArr[0]=1;
		
		int[] intArr2= {11,12,13,14,15};
		System.out.println(intArr2[2]);
		System.out.println("Length of Array: "+intArr2.length);
	}

}
