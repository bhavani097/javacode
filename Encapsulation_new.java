package basics;

class new_encapsulation
{
	private String pw="@^@798887";
	public void setpw(String pw)
	{
		this.pw=pw;
		
	}
	public String getpw()
	{
		return pw;
	}
}

public class Encapsulation_new
{
public static void main(String[] args) 
{
	new_encapsulation N1=new new_encapsulation();
	N1.setpw("$%^&&0998");
	System.out.println(N1.getpw());
	
	}
}
