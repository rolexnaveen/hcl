package test;


class R

{
	public void display()
	{
		System.out.println("hello guru");
	}
}
class Q extends R
{
	
	public void dog ()
	{
		System.out.println("single in"); // single level
	}
}
class P extends Q
{
	public void god()
	{
		System.out.println("oh my god...!");// multi level
	}
}
public  class School 
{
	
public static void main(String[] args) 

{
	P s = new P();
	s.god();
	s.display();
	s.dog();
		
		
	}
}

	
	

