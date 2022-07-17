package com;


public class Sun
{
	public static void main(String[] args) 
	{
		 int m=10;
		 int n=0;

		try
		{
			
		
		int a[] =new int [4];
		a[5] =70;
		}
		catch(ArrayIndexOutOfBoundsException  ae)
		{
			System.out.println(" please check that");
			try
			{
				int z =m/n;
			}
			catch(ArithmeticException aed)
			{
				System.out.println("can't divide by zero");
			}
		}
		
		
	}

}
