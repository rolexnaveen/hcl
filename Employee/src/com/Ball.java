package com;

public class Ball 
{
	public static void main(String[] args)
	{
		int a =50;
		int b =100;
		int c=0;
		
		System.out.println("before swapping a : "+a);
		System.out.println("before swapping b :"+b);
		
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping a : "+a);
		System.out.println("after swapping b : "+b);
	}

}
