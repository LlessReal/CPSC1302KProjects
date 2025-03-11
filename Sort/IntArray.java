
import java.util.Random;
import java.util.Arrays;

public class IntArray {
    private int length;
    private int[] myArray;
    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[this.length];
    }

    public void clear() {
        this.myArray = new int[0];
    }

    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < this.myArray.length; i++) {
            int rand_int = rand.nextInt(6) + 1;
            this.myArray[i] = rand_int;
        }

    }
    // Gets index that's asked for
    public int get(int element) {
        return this.myArray[element];
    }

    public boolean isEmpty() {
        // true if no items are in the list and false if otherwiise
        if (this.myArray.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void set(int element, int newValue) {
        // Changes index item to new value
        this.myArray[element] = newValue;

    }

    // Returns length of array
    public int size() {
        return this.myArray.length;
    }
    // Sort Array
    public void sort() {
        Arrays.sort(this.myArray);
    }

    public String toString() {
        return Arrays.toString(this.myArray);
    }
}