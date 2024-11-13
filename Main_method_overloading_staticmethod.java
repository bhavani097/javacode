package basics;

public class Main_method_overloading_staticmethod 
{
public static void main(int a,int b)
{
	System.out.println("print values ->"+a+" " +b);
}
public static void main(String a,String b)
{
	System.out.println("print values ->"+a +" " +b);
}
public static void main(String[] args) 
{
	main(8746238,908);
	main("bhavani","varanasi");
} 

}
