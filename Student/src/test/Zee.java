package test;

interface Animal
{
	void show();
}
interface Man extends Animal
{
	void display();
}

public class Zee  implements  Man{
	public void show()
	{
		System.out.println(" hello");
	}
	public void display()
	{
		System.out.println("singam.!");
	}
	public static void main(String[] args) 
	{
		Zee e = new Zee();
		
		e.show();
		e.display();
		
	}

}
