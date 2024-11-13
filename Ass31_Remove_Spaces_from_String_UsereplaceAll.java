package Java_programs;

public class Ass31_Remove_Spaces_from_String_UsereplaceAll 
{
	public static void main(String[] args) 
	{
		String s1 = "My Name is Java";
		String newString = s1.replaceAll(" ","");
		System.out.println("Old String Before Space remove- "+s1); // My Name is Java
		System.out.println("New String After Space remove- "+newString); //MyNameisJava

	}
}
