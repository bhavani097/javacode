package basics;

public class Nested_If 
{
public static void main(String[] args)
{
	String name ="female";
	int age = 2;
	 

			
	if(name=="female")
	{
		System.out.println("ticket is free");
	}
   else
	   if(age<=2)
	   {
		   System.out.println("its free for below 2");
	   }
	   else
		   if(age<=12)
		   {
		   System.out.println("its half ticket");
		   }
	       else
	       {
	    	  if(age<=60)
	    	  {
	    		  System.out.println("Full ticket");
	    	  }
	       
	    	  else if(age>60)
	    
	    		    
	    	  {
	    		  if(age<=100)
	    		  
	    		  System.out.println("half ticket");
	    		  else
	    		  System.out.println("should not travel");
	    	  }
	    	 
	    	  
	        }
		 
    }
}
