package Java_programs;

import java.util.Arrays;

public class Ass34_Anagaram
{
public static void main(String[] args) 
{
	String name="RAM";
	String name1="ARM";
	
	char[] c1=name.toCharArray();
	char[] c2=name1.toCharArray();
	System.out.println(Arrays.toString(c1));
	 System.out.println(Arrays.toString(c2));
	
	boolean b1= Arrays.equals(c1, c2);
	System.out.println(b1);
	
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	boolean b2= Arrays.equals(c1, c2);
	System.out.println(b2);
	
	if (b2==true)
	{
		System.out.println("its anagram");
	}
	else
	{
		System.out.println("its not anagarm");
	}
}
}
