package com;

public class Ze 

{
	int id;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public static void main(String[] args) 
	{
		Ze ob = new Ze();
		ob.setId(90);
		System.out.println(ob.getId());
		
	}
	
	

}
