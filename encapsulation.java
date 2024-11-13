package basics;

class encapsulation_097
{
	private String un ="Bhavanivaransi91@gmail.com";//global variable
	public void setun(String un)
	{
		this.un=un;//local variable assign to global variable 
		
	}
	public String getun()
	{
		return un;
	}
	
}

public class encapsulation 
{
 public static void main(String[] args) 
 {
	 encapsulation_097 e1=new encapsulation_097();
	 e1.setun("bhavani@gmail.com");
	 System.out.println(e1.getun());
}
}
