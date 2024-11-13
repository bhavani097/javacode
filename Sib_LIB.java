package basics;

public class Sib_LIB 
{
static 
{
	System.out.println("SIB");
}
{
	System.out.println("LIB");
}
Sib_LIB()
{
	System.out.println("constrcor");
}
public static void main(String[] args) 
{
	new Sib_LIB();
	System.out.println("main method");
}
}
