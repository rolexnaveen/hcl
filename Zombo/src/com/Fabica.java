package com;

public class Fabica 
{
	
	public static void main(String[] args) {
		
		int n1=30;
		int n2 =31;
		int tem=0;
		int count=10;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2 ; i<count ;i++)
		{
			tem=n1+n2;
			System.out.println(" "+tem);
			
			n1=n2;
			n2=tem;
		}
	}

}
