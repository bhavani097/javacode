package basics;

import java.util.Date;

public class Date_today 
{
public static void main(String[] args) 
{
	Date d1 =new Date();
	d1.getTime();
	System.out.println(d1.getTime());
	Date d2=new Date();
	d2.getTime();
	System.out.println(d2);
	Date d3=new Date(d2.getTime()-1000*60*60*24*1);
	System.out.println(d3);
	Date d4=new Date(d3.getTime()+1000*60*60*24*1);
	System.out.println(d4);
	
	
}

}
