package test;

public class Test1 {

	int id;
	static String name;
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.id = 1;
		t1.name = "abc";
		System.out.println(t1.id); // 1
		System.out.println(t1.name); // abc
		
		Test1 t2 = new Test1();
		t2.id = 200;
		t2.name = "xyz";
		System.out.println(t2.id); // 200
		System.out.println(t2.name); // xyz

		System.out.println(t1.id); // 1 200
		System.out.println(t1.name);// xyz
		
	}
}
