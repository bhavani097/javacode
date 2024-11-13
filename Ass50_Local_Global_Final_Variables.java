package Java_programs;

public class Ass50_Local_Global_Final_Variables 
{
	/*Assignment 50 - WAP which has Local, Global and Final variables in it.
	Print all variables value
 */
final String s1 = "Earth is Unique";
char l = 'M';
static double r = 34613.133;

public static void main(String[] args) 
{
	float x = 3.124f;
	Ass50_Local_Global_Final_Variables l1= new Ass50_Local_Global_Final_Variables();
	System.out.println("Final Variable - "+ l1.s1);
	System.out.println("Global Variable - "+ l1.l);
	System.out.println("Static Gloabal Variable - "+ r);
	System.out.println("Local Variable - "+ x);


}
}
