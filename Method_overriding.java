package basics;
class method_new
{
	void login_amazon()//non static methods we creaetd 
	{
		System.out.println("with user email id");
	}
	void login_fb()
	{
		System.out.println("with mobile number");
	}
}
public class Method_overriding extends method_new

{
	void login_amazon()
	{
		super.login_amazon();
		
		System.out.println("with user email id");
		
	}
	void login_fb() 
	{
		super.login_fb();
		System.out.println("with mobile number");
	}
public static void main(String[] args) 
{
	method_new m1=new method_new();
	m1.login_amazon();
	m1.login_fb();
	
}
}
