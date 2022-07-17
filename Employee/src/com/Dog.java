package com;

public class Dog 
{
	
	private int id ;
	
	private String name;
	private int pincode;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public static void main(String[] args) {
		
		Dog s = new Dog();
		s.setId(11);
		System.out.println(s.getId());
		s.setName("naveen");
		System.out.println(s.getName());
		s.setPincode(517299);
		System.out.println(s.getPincode());
	}

}
