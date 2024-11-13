package basics;
abstract class Fb_Auth
{
	abstract  void fb_login();
	abstract  void fb_regiter();
}
abstract class Google_auth extends Fb_Auth
{
	abstract  void google_login();
	abstract void google_regiter();
}

public class Grotectmainds extends Google_auth//Concrete cls 
{



 void google_login() {
	System.out.println("google");
	
}


 void google_regiter()
{
	System.out.println(3);
	
}


 void fb_login() {
	
	System.out.println(2);
}


void fb_regiter() {
	
	System.out.println(1);
}

public static void main(String[] args) 
{
	Grotectmainds obj = new Grotectmainds();

    // Call the implemented methods
    obj.fb_login();
    obj.fb_regiter();
    obj.google_login();
    obj.google_regiter();
}
}





