package Java_programs;

public class Ass42_WAP_throw_throws 
{
public static void main(String[] args) 
{
	
	checkNumber(-5);  // This will throw an exception
}

public static void checkNumber(int number) 
{
    if (number < 0) {
        throw new IllegalArgumentException("Number must be positive");
    }
    System.out.println("The number is " + number);
}

	
}

