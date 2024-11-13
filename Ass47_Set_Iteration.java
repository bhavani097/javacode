package Java_programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ass47_Set_Iteration 
{
	/*
	 * Assignment 47 - Iterate Set Interface
	 */

	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		s1.add("myra");
		s1.add(2657);
		s1.add('K');
		s1.add(null);
		
		Iterator li = s1.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}
}
