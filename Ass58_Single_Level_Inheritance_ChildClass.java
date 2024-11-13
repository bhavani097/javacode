package Java_programs;



public class Ass58_Single_Level_Inheritance_ChildClass extends Ass58_Single_Level_Inheritance_ParentClass
{
	static void Child_Static_Method1()
	{
		System.out.println("Child_Static_Method1");
	}
	void Child_NonStatic_Method1()
	{
		System.out.println("Child_NonStatic_Method1");
	}
	public static void main(String[] args) 
	{
		Child_Static_Method1();
		Parent_Static_Method1();
		Ass58_Single_Level_Inheritance_ChildClass obj = new Ass58_Single_Level_Inheritance_ChildClass();
		obj.Child_NonStatic_Method1();
		obj.Parent_NonStatic_Method1();

	}

}

