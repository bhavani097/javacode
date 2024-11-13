package basics;

import java.util.Scanner;

public class Scanner_developing_Website 
{

public static void main(String[] args)
{;
	Scanner d1=new Scanner(System.in);
	System.out.println("enetr the Fristname:");
	String  Firstname=  d1.next();
	System.out.println("enetr the Lastname:");
	String Lastname=   d1.next();
	System.out.println("enetr the Emailid:");
	String Emailid=    d1.next();
	System.out.println("enter the Password:");
	String Password=   d1.next();
	System.out.println("enter the gender:");
	String gender=      d1.next();
	System.out.println("enetr the presnt address:");
	String Present_address= d1.next();
	System.out.println("enetr the permanent address:");
	String Permanent_address= d1.next();
	System.out.println("enter the pincode:");
	int Pincode=     d1.nextInt();
	
	System.out.println("Details Entered:");
    System.out.println("First Name: " + Firstname);
    System.out.println("Last Name: " + Lastname);
    System.out.println("Email ID: " + Emailid);
    System.out.println("Password: " + Password);
    System.out.println("Gender: " + gender);
    System.out.println("Present Address: " + Present_address);
    System.out.println("Permanent Address: " + Permanent_address);
    System.out.println("Pincode: " + Pincode);
    
	d1.close();
	
}
}
