
public class Calc {
    private double firstnum;
    private double secondnum;
    // Constructor
    public Calc() {
        this.firstnum = 0; // Initialize numbers
        this.secondnum = 0; // Initialize numbers
    }

    public void setNum1(double num) {
        this.firstnum = num;
    }
    public void setNum2(double num) {
        this.secondnum = num;
    }

    // Method that returns first number
    public double getNum1() {
        return this.firstnum;
    }

    // Method that returns second number
    public double getNum2() {
        return this.secondnum;
    }

    // Method that adds both numbers
    public double add() {
        return this.firstnum + this.secondnum;
    }

    // Method that subtracts 2nd number from the 1st
    public double subtract() {
        return this.firstnum - this.secondnum;
    }

    // Method that multiplies em
    public double multiply() {
        return this.firstnum * this.secondnum;
    }

    // Method that divides 2nd number from 1st number
    public double divide() {
        return this.firstnum / this.secondnum;
    }

    // Displays private field values (with newline stuff)
    public String toString() {
        return "Displaying private data fields using toString():\nNum1: " + this.firstnum + "\nNum2: " + this.secondnum;
    }
}