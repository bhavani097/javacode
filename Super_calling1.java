package basics;
class grand_parent
{
	grand_parent(int a,int b){
		System.out.println("grand1");
	}
}
class parent extends grand_parent
{
	parent()
	{
		super(8,9);
		System.out.println("parent");
	}
}
public class Super_calling1 extends parent
{

	Super_calling1()
	{
		super();
		System.out.println("chiled ");
	}
	public static void main(String[] args) 
	{
		new Super_calling1();
	}
}
