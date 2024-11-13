package basics;
class method1
{
	void login()
	{
		System.out.println("login to amazon");
	}
}
public class Polymorphism_runtime extends method1
{
	void login()
	{
		System.out.println("login to fb");
		//super.login();
	}
public static void main(String[] args) 
{
	method1 l1=new method1();
	l1.login();
	
	
}
}
