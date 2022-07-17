package test;

abstract class Bike
{
	 abstract void light();
}



public class Apple extends Bike
{
	public void light()
	{
		System.out.println(" Break......!");
	}
	public static void main(String[] args) {
		
		Bike es = new Apple();
		es.light();
	}
	

}
