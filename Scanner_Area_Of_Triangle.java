package basics;

import java.util.Scanner;

public class Scanner_Area_Of_Triangle
{
	static double Triangle =0.5;
	
public static void main(String[] args) 
{
	Scanner t1=new Scanner(System.in);
	System.out.println("enetr the value of h");
	int h =         t1.nextInt();
    double area=Triangle*h*h;
	System.out.println("eneter the value of Area->"+area);
	t1.close();	
}
}
