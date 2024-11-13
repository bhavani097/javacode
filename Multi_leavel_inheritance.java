package basics;

class grand_parents
{
	public void house()
	{
		System.out.println("property is house");
	}
}
class parents extends grand_parents
{
	public void bike() 
	{
		System.out.println("properitice of bike");
	}
}
public class Multi_leavel_inheritance extends parents
{
 static void car()
 {
	 System.out.println("propertice car");
 }
 public static void main(String[] args) {
	 Multi_leavel_inheritance m1=new Multi_leavel_inheritance();
	 m1.house();
	 m1.bike();
	 car();
}
}
