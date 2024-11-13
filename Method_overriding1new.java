package basics;
class Amazon_login1
{
 void Amazon_login1()
	
	{
		
		System.out.println("login with email id");
	}
}
public class Method_overriding1new extends Amazon_login1
{
void  Amazon_login1()
{
	super.Amazon_login1();
	System.out.println("login with mobile number");
}
public static void main(String[] args) 
{
	Method_overriding1new m1=new Method_overriding1new();
	m1.Amazon_login1();
	
}
}
