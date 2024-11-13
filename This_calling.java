package basics;

public class This_calling 
{
This_calling()
{
	System.out.println(1);//1
}
This_calling(int a)
{
	//this();
	System.out.println("with para");//2
}
This_calling(String name)
{
	//this(8);
	System.out.println(" 2 with para");//3
}
public static void main(String[] args)
{
	new This_calling("bhavani");
	new This_calling(8);
	new This_calling()
;
	}
}
