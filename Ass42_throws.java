package Java_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass42_throws {

	public static void main(String[] args) 
	{
		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Correct Age Entered " + age);
		if(age != 20)
		{
		throw new InputMismatchException("Exception occured");
		}
     
	}

}
