package basics;

public interface CallingStaticMethod 
{
	static void frist_method()
	{
		System.out.println("frist_method");
	}
	static void second_method()
	{
		System.out.println("second_Method");
	}
	static void thrid_method()
	{
		System.out.println("thrid_method");
	}
	static void fourth_method()
	{
		System.out.println("fourth_method");
	}
	static void fifth_method()
	{
		System.out.println("fifth_method");
	}
    public static void main(String[] args)
    {
		System.out.println("Main_Method");
		frist_method();
		second_method();
		thrid_method();
		fourth_method();
		fifth_method();
	}
}
