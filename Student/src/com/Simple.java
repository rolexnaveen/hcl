package com;

public class Simple
{
	int a =10;
	static int b =20;
	static int c=30;
	
	
	public static void main(String[] args) 
	{
		Simple s = new Simple();
		System.out.println(s);// a=10 ; b=20 ;c=30
		s.a=20;
		s.b=40;
		c=60;
		System.out.println(s);// a=20 ; b=40; c=60
		
		
		Simple s1 = new Simple();
		System.out.println(s1);// a=10 ; b=20 ; c=60
		s1.a=60;
		s1.b=90;
		s1.c=b;
		System.out.println(s1);// a=60 ; b=90 ; c=40
		
	}

	@Override
	public String toString() {
		return "Simple [a=" + a + ", b=" + b + ",c=" +c+"]";
	}
	

}
