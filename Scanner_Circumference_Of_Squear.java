package basics;

import java.util.Scanner;

public class Scanner_Circumference_Of_Squear 
{
static int Squear=4;
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the value of A");
	int a=  s1.nextInt();
	int Circumference=Squear*a;
	System.out.println("Circumference_Of_Squear->"+Circumference);
	s1.close();
	
}
	
}
