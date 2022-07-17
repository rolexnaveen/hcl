package com;

public class Aall extends RuntimeException
{

	public String message;
	
	
	public Aall(String message) {
		
		this.message = message;
	}
	public static void main(String[] args) {
		Aall e= new Aall("Hello");
		System.out.println(e);
		
}
}
