package basics;

public class Banglore_Bus_Tickets_NestedIF
{
public static void main(String[] args) 
{
    System.out.println(getBusFare("female", 25)); // Output: Free
    System.out.println(getBusFare("female", 1));  // Output: Free
    System.out.println(getBusFare("male", 1));    // Output: Free
    System.out.println(getBusFare("male", 10));   // Output: Half ticket
    System.out.println(getBusFare("male", 30));   // Output: Full ticket
    System.out.println(getBusFare("male", 65));   // Output: Half ticket
}

public static String getBusFare(String gender, int age) {
    // Check if the gender is female
    if (gender.equalsIgnoreCase("female")) {
        return "Free";
    } else if (gender.equalsIgnoreCase("male")) {
        // Check if the gender is male and handle age-based fare calculation
        if (age < 2) {
            return "Free";
        } else {
            // If age is between 2 and 12, or if the person is a senior citizen (age >= 60)
            if (age >= 2 && age <= 12) {
                return "Half ticket";
            } else if (age >= 60) {
                return "Half ticket";
            } else {
                // Adult (age > 12 and age < 60)
                return "Full ticket";
            }
        }
    } else {
        // Handle invalid gender input
        return "Invalid input";
    }
}

}

