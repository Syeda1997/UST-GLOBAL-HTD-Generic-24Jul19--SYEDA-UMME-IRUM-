package com.dev.assignment;

public class Sum {

	public static void main(String[] args) {
		int[] sum= {1,2,3,4,5,6,7};
		System.out.println("First element is: " +sum[0]);
		int mid=sum.length/2;
		System.out.println("mid element: "+sum[mid]);
		int last=sum.length-2;
		System.out.println("last second element: "+sum[last]);
		int total=sum[0]+sum[mid]+sum[last];
		System.out.println("sum of first,mid and last second element: " +total);		
	}

}
