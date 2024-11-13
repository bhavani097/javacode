package basics;

public class Local_Global_Final 
{
int emid;
double sal;
String name;
void em_details(int emid,double sal,String name)
{
	this.emid=emid;
	this.name=name;
	this.sal=sal;
	System.out.println("emp details ");
}
public static void main(String[] args) 
{
	
	Local_Global_Final l1=new Local_Global_Final();
	l1.em_details(56, 879.86, "bhavani");
	System.out.println(l1.emid);
	System.out.println(l1.name);
	System.out.println(l1.sal);
}
}
