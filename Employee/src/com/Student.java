package com;

public class Student 
{
	
	
	public Student()
	{
		System.out.println("Deafault");
	}
	  public Student (int id , String name)
	  {
		  System.out.println("parametarised");
	  }
	  
	  public Student(String name , int id)
	  {
		  System.out.println("overload");
	  }
	  public Student(Student obj)
	  {
		  System.out.println("object parametarised ");
	  }
	  public static void main(String[] args)
	 {
		  Student t = new Student();
		  Student t1 = new Student(11,"naveen");
		  System.out.println(t1);
		  Student t2 = new Student("naresh",32);
		  Student t3 = new Student(t2);
		
	}
	  
}
