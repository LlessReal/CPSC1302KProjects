import java.util.Scanner; // Class used for inputs

public class Pet {
    // Fields
    private String name; // Empty field for objects (for now)
    private int age;
    private String type;

    // Default Constructor
    public Pet() {
        this.name = "Trump"; // Default object's data
        this.age = 52;
        this.type = "Great";
    }

    // Constructor
    public Pet(String newName, String newType, int newAge) {
        this.name = newName; // new object's data
        this.age = newAge;
        this.type = newType;
    }

    // Mutators
    public void setName(String newName) {
        this.name = newName; // Changes name to whatever
    }
    public void setAge(int newAge) {
        this.age = newAge; // Changes age to whatever
    }
    public void setType(String newType) {
        this.type = newType; // Changes type to whatever
    }

    // Accessors
    public String getName() {
        return this.name; // Returns current name
    }
    public int getAge() {
        return this.age; // Returns current age
    }
    public String getType() {
        return this.type; // Returns current type
    }

    public String speak() {
        // This method will get the name of the object, and determine what sound will be returned for the toString method
        if (this.name == "Dog") { // If it's a dog
            return "woof"; // it speaks woof
        } else if (this.name == "TrumPawg") { // If it's a TrumPawg (Trump Dog)
            return "I'm gonna build a wall"; // It's gonna happen
        } else if (this.name == "Joe Bulldog") {
            return "Can I get Vanilla ice cream please?";
        } else { // If it's none of the above
            return "*Sits there cutely*"; // Makes no sound
        }
    }

    public String toString() {
        String TheName = "Pet Information: \nType: " + this.type + "\nName: " + this.name + "\nSound: " + this.speak() + "\nAge: " + this.age + "\n";
        // this.speak() will run after we get their name
        return TheName; // This is called just puttin the object's name
    } // toString() override

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