package basics;

public class Method_overloading 
{
public static void add(int a ,int b)
{ 
	int add = a+b;
	System.out.println("the value is ->"+add );
}
void add(double a,int b)
{
	double  sum =a*b;
	System.out.println("the value is ->"+sum);
	
}
void add()
{
	System.out.println(1);
}
public static void add(int a)
{
	System.out.println(2);
}
void add(float a,double b)
{
	double mul=a*b;
	System.out.println("the value->"+mul);
}
public static void main(String[] args) 
{
	add(5 ,8);
	Method_overloading m1=new Method_overloading();
	m1.add(8.0, 8);
	m1.add();
	add(5);
	m1.add(7.0f, 12.0);
	
	
}

}
