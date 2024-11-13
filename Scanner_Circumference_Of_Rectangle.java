package basics;

import java.util.Scanner;

public class Scanner_Circumference_Of_Rectangle 
{
static int R=2;//static is used to access variable with out creating object 
public static void main(String[] args) 
{
	Scanner r1=new Scanner(System.in);
	System.out.println("enter the vale of L");
	int L=   r1.nextInt();
	System.out.println("enetr the value of B");
	int B=   r1.nextInt();
	int Circumference=R*(L+B);
	System.out.println("Circumference_Of_Rectangle->"+Circumference);
	r1.close();
}

}
