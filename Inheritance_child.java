package basics;

public class Inheritance_child extends Inheritance2
{
void method3()
{
	System.out.println(3);
}
public static void main(String[] args) {
	Inheritance_child I1=new Inheritance_child();
	I1.method2();
	//I1.method1();
	I1.method3();
	
}
}
