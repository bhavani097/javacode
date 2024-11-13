package basics;

import java.util.Scanner;

public class Scanner_Calculating_Circumference_Of_Circle 
{
   static double pi= 3.14;
    static int c=2;//circle
public static void main(String[] args) 
{
        Scanner c1=new Scanner(System.in);	
        System.out.println("enetr the value of r");
        int r =    c1.nextInt();
        
       double Circumference=c*pi*r;
       System.out.println("Circumference_Of_Circle->"+Circumference);
       c1.close();
       
}

}
