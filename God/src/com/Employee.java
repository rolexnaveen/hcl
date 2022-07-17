package com;

public class Employee 
{
	
	 int m =10;
	 int n =0;
	
	public static void main(String[] args) {
		
		
	
		try
		{
			Employee emp = new Employee();
			int z=emp.m/emp.n;
			
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("can't divide by zero");
		}
		finally
		{
			System.out.println("AE");
		}
	}

}
