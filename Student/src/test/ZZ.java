package test;

interface Sli
{
	void flick();
}
interface Def
{
	void flicks();
}

public class ZZ implements Def,Sli
{

	public void flick()
	{
		System.out.println(" hello macha.......!");
	}
	public void flicks()
	{
		System.out.println("Hello jhon....! ");
	}
	public static void main(String[] args)
	{
		ZZ r = new ZZ();
		r.flick();
		Sli d = new ZZ();
		d.flick();
		Def f = new ZZ();
		f.flicks();
	}
}
