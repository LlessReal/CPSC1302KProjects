public class Pets {
    // Fields
    private String name; // Empty field for objects (for now)

    // Constructor
    public Pets(String name) {
        this.name = name; // Current object's data
    }

    public void setPetName(String thenewname) {
        this.name = thenewname;
    }

    public String getPetName() {
        return this.name; // Returns current name
    }
    public String toString() {
        String TheName = "Name: " + this.name;
        return TheName; // This is called just puttin the object's name
    } // toString() override

    // Main method (for demonstration)
    public static void main(String[] args) {
        // Creating an object of Pets
        Pets Pet1 = new Pets("Joe Biden"); // New object named Pet1 whose name is Joe Biden
        Pets Pet2 = new Pets(""); // New object called Pet2 that has no name yet
        Pet2.setPetName("Trump"); // Use set method to set the name

        System.out.println("Pet Information:");
        System.out.println("Name: " + Pet1.getPetName()); // Could just put Pet1 but im utilizing get for the sake of the assignment
        System.out.println("");
        System.out.println("Pet Information:");
        System.out.println(Pet2); // Using the toString() method
    }
}