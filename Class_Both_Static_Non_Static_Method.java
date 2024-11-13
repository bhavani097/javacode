package basics;

public class Class_Both_Static_Non_Static_Method 
{
 public static void add() 
 {
	int a=10;
	int b=20;
	int add=a+b;
	System.out.println(add);
 }
 static void sub()
 {
 int a=20;
 int b=789;
 int sub=a-b;
 System.out.println(sub);
 }
 public void multi()
 {
	 int a=6543;
	 int b=7423;
	 int multi=a*b;
	 System.out.println(multi);
 }
 void divi()
 {
	 int a=234;
	 int b=543;
	 int divi=a/b;
	 System.out.println(divi);
 }
 void modules()
 {
	 int a=10;
	 int b=20;
	 int modules=a%b;
	System.out.println(modules);
 }
 public static void main(String[] args) 
 {
	add();
	sub();
	Class_Both_Static_Non_Static_Method Non_static_method=new Class_Both_Static_Non_Static_Method();
	Non_static_method.multi();
	Non_static_method.divi();
	Non_static_method.modules();
}
}
