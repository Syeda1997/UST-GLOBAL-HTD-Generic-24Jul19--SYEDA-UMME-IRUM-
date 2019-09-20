package com.dev.exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) throws CustomException  {
		
		try {
			s();
			System.out.println("No exception for s()");
			int res=divide(10,2);
			System.out.println("No exception for divide()");
			System.out.println(res);
		}catch(NegativeArraySizeException e) { /*for multiple catch blocks we can use parameter
			as only exception which holds every exception held in program if you want to use only exception as parameter then you can use that at last*/
			System.err.println("exception caught in catch block");
			System.err.println("getMessage(): "+e.getMessage());
//			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.err.println("exception caught in catch block");
			System.err.println("getMessage(): "+e.getMessage());
		}finally {
			System.out.println("Finally block");
		}

	}
	public static int divide(int i,int j) {
		int res=i/j;
		System.out.println(res);
		return 1;
	}
	public static void s() {
		StringBuffer sb = new StringBuffer(-1);
	}
}
  