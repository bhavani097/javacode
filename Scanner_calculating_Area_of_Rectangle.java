package basics;

import java.util.Scanner;

public class Scanner_calculating_Area_of_Rectangle 
{
	
public static void main(String[] args) 
{
	Scanner r1=new Scanner(System.in);
	System.out.println("eneter the value of L");
	 int L=           r1.nextInt();
	 System.out.println("eneter the value of b");
	  int b=                  r1.nextInt();
	  int area=L*b;
	  System.out.println("Area of rectangle->"+area);
	  r1.close();
}
}
