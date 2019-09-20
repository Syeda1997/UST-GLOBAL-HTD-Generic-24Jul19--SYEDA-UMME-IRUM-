package com.dev.arrays;

public class CreatingArray {

	public static void main(String[] args) {
		int []intnum;  //declaration
		char[] chrveg;
		byte byteven[];
		
		intnum=new int[5];//creation
		chrveg=new char[3];
		byteven=new byte[5];
		
		intnum[0]=1;//initialization
		intnum[1]=2;
		intnum[2]=3;
		intnum[3]=4;
		intnum[4]=5;
		
		chrveg[0]='a';
		chrveg[1]='b';
		chrveg[2]='c';
		
		byteven[0]=0;
		byteven[1]=2;
		byteven[2]=4;
		byteven[3]=6;
		byteven[4]=8;
		
		System.out.println(intnum[1]*3);
		System.out.println(intnum[0]+2);//utilization
		System.out.println(intnum[2]-1);
		System.out.println(intnum[3]/4);
		System.out.println(intnum[4]%4);
	}

}
