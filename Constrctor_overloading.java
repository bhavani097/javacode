package basics;

public class Constrctor_overloading 
{
	Constrctor_overloading() 
	{
		this(8,9);
		System.out.println(1);
	}
	Constrctor_overloading(int a,int b)
	{
		System.out.println(2);
	}
	public static void main(String[] args) 
	{
		new Constrctor_overloading(); 
	}
}
