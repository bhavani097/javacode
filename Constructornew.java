package basics;

public class Constructornew 
{

static void S1(int a,int b)
    {
	System.out.println("static method one got excuted");
    }
   public static void S2(double a,int c)
   {
	   System.out.println("static menthod two got excuted");
   }
   public static void  S3(String a ,int d)
   {
	   System.out.println("static menthod three got excuted");
   }
   void Ns1(String name,double f)
   {
	System.out.println("non static method one got excuted");
   }
   void Ns2(int a,int b)
   {
	   
	   System.out.println("non static method two got excuted");
	   
   }
   void Ns3(String name,String name2)
   {
	   System.out.println("non static method three got excuted"); 
   }
   Constructornew(int a)
   {
	 
	System.out.println("constructor with parameter1");
   }
   Constructornew(String name)
   {
	   System.out.println("constructor with parameter2");
   }
   Constructornew(float n)
   {
	   System.out.println("constructor with parameter3");
   }
   public static void main(String[] args) 
   {
	S1(12,26);
	S2(0.0,25);
	S3("bhavani",54);
	Constructornew s1=new Constructornew(12);
	
	Constructornew s2=new Constructornew("bhavani");
	
	Constructornew s3=new Constructornew(537456375f);
	s1.Ns1("myra",3.2);
	s2.Ns2(647272,4723);
	s3.Ns3("raja","myra");
}
}
