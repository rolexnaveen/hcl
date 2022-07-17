package com;

public class Student
{
	static int m=10;
	static int n=0;

	
	public static void main(String[] args) 
	{
		try
		{
			int z =m/n;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("can't divide by zero");
		}
		finally
		{
			System.out.println("Finally");
		}	
	}
}


