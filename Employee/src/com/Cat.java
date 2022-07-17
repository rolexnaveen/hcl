package com;

public class Cat
{
	
	public static void main(String[] args)
	{
		int n=153;
		int r=0;
		int s=0;
		int temp=n;
		
		while(n>0)
		{
			 r= n%10;
			 n=n/10;
			// s=s*10+r;
			 s=s+r*r*r;
			 System.out.println("reverse"+s);
			
		}
		if (temp==s)
		{
			System.out.println("amo");
		}
		else
		{
			System.out.println("not among");
		}
	}

}
