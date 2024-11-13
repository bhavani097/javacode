package basics;

public class Main_Method_Overloading 
{
	public void main(int a)
	{
		System.out.println("main method is non static with para int data type"+" " + a);
	}
	public void main(String a)
	{
		System.out.println("main method is non static with para String data type"+ " "+a);
	}
	public void main(char value)
	{
		System.out.println("main method is non static with para String data type"+" "+value );
	}
	public static void main(String[] args) 
	{
		Main_Method_Overloading  m1=new Main_Method_Overloading ();
		m1.main(9788);
		m1.main("bhavani");
		m1.main('B');
	}
}
