package basics;
class Inheritance_supermostclass
{
	static void mobile()
	{
		System.out.println("i have mobile");
	}
	static void cycle() 
	{
		System.out.println("i have cycle");
	}
}
class Inheritance_superclass extends Inheritance_supermostclass
{
	static void car()
	{
		System.out.println("i have car");
	}
	static void bike() 
	{
		System.out.println("i have bike");
	}
	void phone()
	{
		System.out.println(1);
	}
}

public class Inheritance_multilevel_Single_Program extends Inheritance_superclass
{
        static void house()
         {
	     System.out.println("i have house");
          }
        public static void main(String[] args)
        {
        	Inheritance_multilevel_Single_Program.house();
        	Inheritance_multilevel_Single_Program l1=new Inheritance_multilevel_Single_Program();
        	l1.phone();
        	cycle();
        	mobile();
        	house();
		}
        

}
