package test;

public class FinalTest1 
{
	
	final float a=10.9f;
	final int b;
	{
		System.out.println("Hello");//4 &10
	}
	static
	{
		System.out.println("90");//1
	}
	
	FinalTest1(int x)
	{
		b=x;//this.b=b;
	}
	{
		System.out.println("good");//5 & 11
	}
	public static void main(String[] args) {
		
		System.out.println("guru..!");//3
		
		FinalTest1 t1 = new FinalTest1 (30);
		System.out.println("Bad....!");//7
		System.out.println(t1.a);//8
		System.out.println(t1.b);//9
		FinalTest1 t2 = new FinalTest1(90);
		System.out.println(t2.a); //12
		System.out.println(t2.b);  //13

}
}