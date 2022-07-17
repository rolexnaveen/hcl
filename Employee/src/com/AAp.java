package com;

public class AAp 
{
	public static void main(String[] args) {
		

		int sum=0;
		int digits=0;
		int num=898;
		
		while(num>0)
		{
			digits= num%10;
			sum=sum+digits;
			num=num/10;
		}
		System.out.println(sum);
		
	}
	
}
