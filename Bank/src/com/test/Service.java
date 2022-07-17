package com.test;


public class Service
             
{
	AccountDetails act = new AccountDetails();
	
	
    
	 
	
	public void deposite(double amount)
	{
		double bal = act.getAmount();
		System.out.println(" before deposite Amount "+bal);
		if(amount<0)
		{
			System.out.println("amount should not be negative.");
		}
		else
		{
			double balance = bal+amount;
			act.setAmount(balance);
			System.out.println("after deposite");
			double balance1= act.getAmount();
			System.out.println(balance1);
		}
		
	}
	
	public  void withdrawn(double amount1)
	{
		double bal = act.getAmount();
		
		System.out.println("");
		if (bal>=amount1)
		{
			System.out.println("current balance Amount : "+bal);
		double balance = bal-amount1;
		act.setAmount(balance);
		System.out.println("After withdrawn : "+act.getAmount());
		
		double balance1= act.getAmount();
		System.out.println(balance1);
		
		}
		
	}
	
	public void balanceEnquiry()
	{
		act.setAmount(500.0);
		double bal = act.getAmount();
		System.out.println("you are balance :"+bal);
	}

	
	

}
