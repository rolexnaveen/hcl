package com;

public class Egg
{
	
	public static void home()
	{
		System.out.println("Welcome to home");
		
		
	}
	public static void gone()
	{
		System.out.println("gone.....!");
		home();
	}
	
	public void want()
	{
		System.out.println("Wanted..!");
		gone();
	}
	
	public static void main(String[] args) 
	{
		Egg r = new Egg();
		r.want();
		home();
		gone();
		
	}

}
