package com;

public class Primes 
{
	
	public static void main(String[] args) {
		
		int num =17;
		
		int r=0;
		int m =num/2;
		
		for(int i=2; i<=m; i++)
		{
			if(num%2==0)
			{
				r=r+1;
				break;
			}
		}
		if(r==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	

}
