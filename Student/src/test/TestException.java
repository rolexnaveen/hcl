package test;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class TestException {

	public void test() {
	
		System.out.println("in test");
		try {
			test1();
		} catch (SQLClientInfoException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("aaaaaa");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("aaaaaa");
		}
		
	}
	
	public void test1() throws SQLException {
		
		System.out.println("in test1");
		test2();
	}
	
	public void test2() throws SQLException {
		
		System.out.println("in test2");
		
		throw new SQLException();
	}
	
	public static void main(String[] args) {
		
		TestException exception = new TestException();
		
		exception.test();
		
	}
	
}
