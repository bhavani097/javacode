package Java_programs;


	class ParentClass
	{
		public static void method1()
		{
			System.out.println("Parent class Static method");
		}
		public void method2()
		{
			System.out.println("Parent class Non Static method");
		}
	}


public class Ass57_Single_Level_Inheritance extends ParentClass
	{
		public static void Childmethod1()
		{
			System.out.println("Child class Static method");
		}
		public void Childmethod2()
		{
			System.out.println("Child class Non Static method");
		}

		public static void main(String[] args)
		{
			Childmethod1();
			method1();
			Ass57_Single_Level_Inheritance obj = new Ass57_Single_Level_Inheritance();
			obj.Childmethod2();
			obj.method2();

		}
	}


