package Java_programs;

import java.util.Scanner;

public class Ass56_Switch_case
{
	/*
	 * Assignment 56 - WAP for switch case having keywords - switch, case, default and break
	 */

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENter Name");
		String name = s1.next();
		switch(name)
		{
		case "bhavani":
			System.out.println("bhanu");
			break;
		case "myra":
			System.out.println("chinnu");
			break;
		case "lilly":
			System.out.println("laharika");
			break;
		default:
			System.out.println("Enter Correct Name");
	
		}
	}
}
