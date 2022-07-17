package com;

public class Young
{
	static int m=10;
	static int n=0;
	public static void main(String[] args) {
		
	
	
	try
	{
		
		try
		{
			
		
		String s="abc"; 
		int i=Integer.parseInt(s);
		}
		
		catch(NumberFormatException ne)
		{
			
			System.out.println("sorry....!");
		}
		
	}
	catch(Exception e)
	{
		System.out.println("can't divide by zero");
	}
	finally
	{
		System.out.println("Finally");
		try
		{
			
		
		String s="abc"; 
		int i=Integer.parseInt(s);
		}
		
		catch(NumberFormatException ne)
		{
			
			System.out.println("sorry....!");
		}
		finally
		{
			System.out.println("good");
		}
	}	
}
}
