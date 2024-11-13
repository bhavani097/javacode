package basics;

import java.util.Scanner;

public class Scanner_Area_Of_Tripezium 
{
static double Tripezium =0.5;//data type is double 

public static void main(String[] args) 
{
	Scanner t1= new Scanner(System.in);
	System.out.println("eneter the value of L1");
	int L1=      t1.nextInt();
	System.out.println("eneter the value of L2");
	int L2=      t1.nextInt();
	System.out.println("enetr the value of h");
	int h=      t1.nextInt();
	double area= Tripezium*(L1+L2)*h;
	System.out.println("enetr the value of Area->"+area);
	t1.close();
}
}
