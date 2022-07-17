package com;

public class ExceptionTest {
	
	
	public int div(int a, int b) {
		
		int r = 0;
		
		try {
			r = a/b;
		} catch (Exception e) {
			throw new Aall("you can not div with 0");
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		new ExceptionTest().div(10, 0);
	}

}
