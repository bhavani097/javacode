package basics;
import java.util.Scanner;
public class Scanner_Adding_twovalues
{
public static void main(String[] args) 
{
	Scanner g1=new Scanner(System.in);

	   System.out.println("enetr the values of a");
	   int a=     g1.nextInt();
	   System.out.println("enetr the value of b");
	   int b=     g1.nextInt();
	   
	   int sum=a+b;
	   System.out.println("add two values of->"+sum);
	   g1.close();
}
}
