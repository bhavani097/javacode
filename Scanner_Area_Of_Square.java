package basics;

import java.util.Scanner;

public class Scanner_Area_Of_Square 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("enetr the value of square a");
	int a =              s1.nextInt();

	int area=a*a;
	System.out.println("Area of Square->"+area);
	s1.close();
	
}
}
