package Java_programs;

import java.util.Date;

public class Ass37_WAP_Present_Time 
{
public static void main(String[] args)
{
	Date d1=new Date();
	long l1=d1.getTime();
	System.out.println(l1);
	Date d2=new Date(d1.getTime());
	System.out.println(d2);
	
	
}
}
