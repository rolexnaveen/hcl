package com;

public class Number 
{
	public static void main(String[] args)
	
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
		finally
		{
			System.out.println("Good");
		}
	}

}
