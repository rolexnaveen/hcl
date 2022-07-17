package com;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class ExceptionExample1 {

	public void test() throws SQLException {
		
		try {
			throw new SQLException();
		} catch (SQLClientInfoException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally");
		}
		System.out.println("567");
	}
	
	public static void main(String[] args) throws SQLException {
		ExceptionExample1 example1 = new ExceptionExample1();
		example1.test();
		
	}
}
