package Java_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ass46_List_Iteration 
{
	/*
	 * Assignment 46 - Iterate List Interface
	 */

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add(2334);
		l1.add("bhavani");
		l1.add(00.86);
		l1.add('d');
		l1.add(null);
		
		Iterator i1 = l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator i2 = l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}
