
import java.util.ArrayList; // Class for ArrayList Objects

public class Asn5 {
    public static void main(String[] args) {
        ArrayList<String> StringArray = new ArrayList<String>();
        StringArray.add("I"); StringArray.add("frikin"); StringArray.add("hate"); StringArray.add("ningens");
        ArrayList<Integer> IntArray = new ArrayList<Integer>();
        IntArray.add(6); IntArray.add(9); IntArray.add(4); IntArray.add(2);
        System.out.println("All items in the integer array:");
        for (int i : IntArray) {System.out.println(i);}
        System.out.println("All items in the string array:");
        for (String i : StringArray) {System.out.println(i);}
    }
}