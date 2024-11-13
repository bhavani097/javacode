package basics;

import java.util.Scanner;

public class Scanner_Calculating_Area_of_Circle 
{
	static double pi=3.14;//
	
 public static void main(String[] args) 
 {
	
	 Scanner s1=new Scanner(System.in);	//it only have the parameterized constructor and also its comes from java.lang package
	 System.out.println("eneter the value of r");
	 int r=                s1.nextInt();//method
	 
	double area=pi*r*r;
	
	System.out.println("Area of circle->"+area);
	s1.close();
}
 
}
//system.in is used to accept the request 
//system.out used to give the results 