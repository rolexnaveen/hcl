package test;

abstract class Employee
{
	abstract void test();
	
	public void show()
	{
		System.out.println("Egg....!");
	}
}
public class Silky extends Employee
{
	public void test()
	{
		System.out.println("hello guru");
	}
	public static void main(String[] args) {
		
		Employee emp = new Silky();
		emp.test();
		emp.show();
	}

}
