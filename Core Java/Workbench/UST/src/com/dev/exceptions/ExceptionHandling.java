package com.dev.exceptions;

public class ExceptionHandling extends CustomException  {

	public static void main(String[] args) {
		try {
			s();
		}catch(Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}finally {
			System.out.println("This is finally block");
		}
		System.out.println("Code after exception");
	}
	public static void s() throws CustomException {
		int i=-1;
		if(i<0) {
			throw new CustomException();
		}
		StringBuffer sb = new StringBuffer(-1);
		
	}
}
