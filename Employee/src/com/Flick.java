package com;

public class Flick
{
	
	public void van()
	{
		System.out.println("hello van");
		pig();
	}
	
	public static void gan()
	{
		System.out.println("this is static method");
		Flick th = new Flick();
		th.pig();
	}
	public void pig()
	{
		System.out.println("This is instance");
	}
	
	public static void main(String[] args) {
		
		Flick th = new Flick();
		th.van();
		gan();
	}

}
