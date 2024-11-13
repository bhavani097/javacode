package Java_programs;

public class Ass48_Method_Overloading 
{
	/*
	 * Assignment 48- WAP of Method Overloading
	 */
	static void m1()
	{
		System.out.println("method without parameter");
	}
	static void m2(int a)
	{
		System.out.println("method with int parameter value is - "+a);
	}
	void m1(String s)
	{
		System.out.println("Non Static method with String parameter value is - "+s);
	}

	public static void main(String[] args) 
	{
		m1();
		m2(15);
		Ass48_Method_Overloading m1 = new Ass48_Method_Overloading();
		m1.m1("bhavani");

	}

}
