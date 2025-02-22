
public class Calc {
    private double firstnum;
    private double secondnum;
    // Constructor
    public Calc() {
        this.firstnum = 0;
        this.secondnum = 0;
    }

    public void setNum1(double num) {
        this.firstnum = num;
    }
    public void setNum2(double num) {
        this.secondnum = num;
    }

    public double getNum1() {
        return this.firstnum;
    }
    public double getNum2() {
        return this.secondnum;
    }
    public double add() {
        return this.firstnum + this.secondnum;
    }
    public double subtract() {
        return this.firstnum - this.secondnum;
    }

    public double multiply() {
        return this.firstnum * this.secondnum;
    }
    public double divide() {
        return this.firstnum / this.secondnum;
    }

    public String toString() {
        return "Displaying private data fields using toString():\nNum1: " + this.firstnum + "\nNum2: " + this.secondnum;
    }
}