// Here are where you bring in
import java.util.ArrayList;


public class Pets {
    // Fields
    private String name1;
    private String name2;

    // Constructor
    public Pets(String name) {
        this.name1 = name;
    }

    public void setPetName(String name) {
        this.name2 = name;
    }

    public String getPetName() {
        return name2;
    }

    // Main method (for demonstration)
    public static void main(String[] args) {
        // Creating an object of Pets
        Pets Pet1 = new Pets("Joe Biden");
        Pets Pet2 = new Pets("");
        Pet2.setPetName("Trump");

        System.out.println("Pet Information:");
        System.out.println("Name: " + Pet1.name1);
        System.out.println("");
        System.out.println("Pet Information:");
        System.out.println("Name: " + Pet2.getPetName());
    }
}