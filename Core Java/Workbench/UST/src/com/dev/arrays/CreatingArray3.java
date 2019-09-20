package com.dev.arrays;

public class CreatingArray3 {

	public static void main(String[] args) {
		int[] arr= {11,22,33,44,55};
		int i=3;
		if(i<arr.length-1) {
			System.out.println("index is present");
			for(int j=0;j<=i;j++) {
				System.out.println( +arr[j]);
			}
		}
		else {
			System.out.println("index is absent");
		}
	}

}
