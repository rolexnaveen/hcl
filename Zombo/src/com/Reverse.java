package com;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		do
		{
			
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int n = sc.nextInt() ;
		int r=0;
		int s=0;
		
		int temp=n;
		
		while(n>0)
		{
			r= n%10;
			n=n/10;
			s=s*10+r;
			System.out.println(s);
		}
		if(temp==s)
		{
			System.out.println("pali");
		}
		else
		{
			System.out.println("not pali");
		}
		}
	
	while(1>0);
		}
	
	
	
			
		
	}


