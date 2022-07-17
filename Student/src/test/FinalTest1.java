package test;

public class FinalTest1 

{
	
	final int a =10;
	static final int b ;  
	
	static {
		b = 30;
		System.out.println("in static "+b);
	}
	
	{
		//b = 30;
		System.out.println(" Good "); //2 8
	}
		
	FinalTest1(int b)
	{
		System.out.println("aaa");//5 11
		//this.b=b;
		System.out.println("bbbb");//6 12
	}
	
	{
		System.out.println("9");//3 9
	}

	public static void main(String[] args) {
		
			System.out.println("good man"); // 1
		FinalTest1 obj = new FinalTest1(20);
		System.out.println("Bad man");//7
		FinalTest1 obj2 = new FinalTest1(20);
		
		System.out.println(obj.a);//13
		
		
		System.out.println(obj.b);//14
	

}
	static {
		//FinalTest finalTest = new FinalTest(10);
		//finalTest.b = 30;
		System.out.println("in static2");
	}
	
	{
		System.out.println("90");//4 10
	}
	
}
