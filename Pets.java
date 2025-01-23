public class Pets {
    // Fields
    private String name;

    // Constructor
    public Pets(String name) {
        this.name = name;
    }

    public void setPetName(String thenewname) {
        this.name = thenewname;
    }

    public String getPetName() {
        return this.name;
    }
    public String toString() {
        String TheName = "Name: " + this.name;
        return TheName;
    } // toString() override

    // Main method (for demonstration)
    public static void main(String[] args) {
        // Creating an object of Pets
        Pets Pet1 = new Pets("Joe Biden");
        Pets Pet2 = new Pets("");
        Pet2.setPetName("Trump");

        System.out.println("Pet Information:");
        System.out.println("Name: " + Pet1.getPetName());
        System.out.println("");
        System.out.println("Pet Information:");
        System.out.println(Pet2);
    }
}