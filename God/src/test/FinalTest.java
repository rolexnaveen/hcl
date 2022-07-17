package test;

public class FinalTest
{
	
	final float a=10.9f;
	final int b;
	{
		System.out.println("Hello");//4
	}
	static
	{
		System.out.println("90");//1
	}
	
	FinalTest(int x)
	{
		b=x;//this.b=b;
	}
	{
		System.out.println("good");//5
	}
	public static void main(String[] args) {
		
		System.out.println("guru..!");//3
		
		FinalTest t1 = new FinalTest(30);
		System.out.println("Bad....!");//7
		System.out.println(t1.a);//8
		System.out.println(t1.b);//9
	}
	static
	{
		System.out.println("80");//2
	}
	{
		System.out.println("silly");//6
	}

}
