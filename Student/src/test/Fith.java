package test;
class Z 
{
	void gil()
	{
		System.out.println("jai...");
	}
}

class H extends Z
{
	void disk()
	{
		System.out.println("jimmy");
	}
}

class L extends Z
{
	void fix()
	{
		System.out.println("fixers");// Hierarchical
	}
}
public class Fith
{
	public static void main(String[] args) {
		
        L i = new L();
         i.fix();
        i.gil();
       H e = new H();
       e.disk();
       e.gil();
}
}