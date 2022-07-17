package com;

import java.sql.SQLException;

public class YYo
{
	
	public void add()throws SQLException
	{
		sno();
		
	}
	public void add1 () throws SQLException
	{
		System.out.println("good");
		sno();
		
	}
	public void sno() throws SQLException
	{
		System.out.println("hello");
		throw new SQLException("system error");
	}
	
	
	public static void main(String[] args) 
	{
		YYo e = new YYo();
		try
		{
			e.add();
		}
		catch(SQLException se)
		{
			System.out.println("OK....!");
		}
		try {
			e.add1();
		} catch (SQLException e1) {
			
			System.out.println("fine");
		}
	}

}
