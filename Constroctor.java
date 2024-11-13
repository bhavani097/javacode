package basics;

public class Constroctor 
{
Constroctor()
{
	//int add=a+b;
	System.out.println("1");
}
Constroctor(int a)
{
	System.out.println(2);
	
}
/*public void Constroctor1(int a)
{
	System.out.println(3);
}*/
Constroctor(float a)
{
	System.out.println(4);
}

public static void main(String[] args) 
{
	 new Constroctor();
	 new Constroctor(8);
	 new Constroctor(809.87f);
	 //Constroctor c1=new Constroctor();
	// c1.Constroctor1(8);
	
}
}
