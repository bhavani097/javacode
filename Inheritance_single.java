package basics;
class teacher
{
	static void cs()
	{
		System.out.println("program cs");
	}
}

public class Inheritance_single extends teacher
{
static void course()
{
	System.out.println("courses");
}
public static void main(String[] args) {
	cs();
	course();
	
}
}
