package basics;

public class IIB 
{
	static
	{
		System.out.println("SIB");//1
	}
	{
		System.out.println("IIB");//3
	}
	{
		System.out.println("iib2");//4
	}
	IIB()
	{
		System.out.println("constrcotor");//6
	}
	{
		System.out.println("iib1");//5
	}
public static void main(String[] args) 
	{
		System.out.println("main method");//2
		new IIB();
		new IIB();
	}

}
