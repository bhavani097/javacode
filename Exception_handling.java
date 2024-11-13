package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling
{
public static void main(String[] args) 
{
	
	try
	{
	Scanner s1=new Scanner(System.in);
	 int age=          s1.nextInt();
	 
	 System.out.println("enetr the value->"+age);
	}
	catch(InputMismatchException a1)
	{
		System.out.println("soory enter the wrong value ");
	}
	
	Scanner s2=new Scanner(System.in);
	 int age1=          s2.nextInt();
	 
	 System.out.println("enetr the value->"+age1);
}
	
}
