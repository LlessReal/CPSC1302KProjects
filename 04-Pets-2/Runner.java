import java.util.Scanner; // Class used for inputs

public class Runner {
    // Main method (for demonstration)
    public static void main(String[] args) {
        // Creating an object of Pet
        Pet Pet1 = new Pet(); // New object named Pet1 whose name is Joe Biden, age 78 and their type is near reetirement
        Pet Pet2 = new Pet("Joe Bulldog","Near Retirement",78); // Creates object Pet2, with default values
        Pet Pet3 = new Pet(); // Creates object Pet3, but it's a Bull Dog that's 2 years old
        System.out.println(Pet1); // Runs the toString() override method
        System.out.println(Pet2); // Using the toString() method

        Scanner usersPet = new Scanner(System.in);
        System.out.println("State your pet's name.");
        String usersPetName = usersPet.nextLine(); // Prompts input for namme
        System.out.println("State your pet's type.");
        String usersPetType = usersPet.nextLine(); // Prompts input for type
        System.out.println("State your pet's age.");
        int usersPetAge = usersPet.nextInt(); // Prompts input for age , Can't put this before nextLine() as a \n character is left in the buffer (for some reason)
        Pet3.setName(usersPetName);
        Pet3.setType(usersPetType);
        Pet3.setAge(usersPetAge);
        System.out.println(Pet3);
    }
}