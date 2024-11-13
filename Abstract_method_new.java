package basics;
abstract class one
{
	abstract void login_fb();
}
public class Abstract_method_new extends one

{
public static void main(String[] args) 
{
	Abstract_method_new ab1= new Abstract_method_new();
	ab1.login_fb();
}

	void login_fb() 
	{
		
		System.out.println("fb login");
	}

}
