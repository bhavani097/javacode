package Java_programs;

public class Ass49_Constructor_Overloading 
{
	Ass49_Constructor_Overloading()
	{
		System.out.println("Constructor without parameter ");
	}
	Ass49_Constructor_Overloading(int a)
	{
		System.out.println("Constructor with int parameter "+a);
	}
	Ass49_Constructor_Overloading(char m)
	{
		System.out.println("Constructor with char parameter "+m);
	}

	public static void main(String[] args) 
	{
		
		Ass49_Constructor_Overloading constructor1 = new Ass49_Constructor_Overloading();
		new Ass49_Constructor_Overloading(14);
		new Ass49_Constructor_Overloading('B');
	}
}
