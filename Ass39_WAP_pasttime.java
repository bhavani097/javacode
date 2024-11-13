package Java_programs;

import java.util.Date;

public class Ass39_WAP_pasttime 
{
public static void main(String[] args) 
{
	Date d1=new Date();
	long l1=d1.getTime();
	System.out.println(l1);
	Date d2=new Date(d1.getTime()-(1000*60*60*24*1));
	System.out.println(d2);
}
}
