import java.text.DecimalFormat;

public class Tests {
    private int score; // Private fields
    private double ave;
    private int count;
    // Default Constructor
    public Tests() {
        this.score = 0;
        this.count = 0;
        this.ave = ave;
    }
    public int getScore() {
        return this.score;
    }
    public int getCount() {
        return this.count;
    }
    public double getAve() {
        return this.ave;
    }

    // gets result to be printed
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return "The average of the " + this.count + " scores entered is: " + df.format(this.ave);
        // Average will be formatted with 2 decimals thanks to df
        // if 0 / 0 , then NaN will be printed because that aint no number
    }

    // Set new values
    public void setScore(int newScore) {
        this.score = newScore;
    }

    //
    public static void getAverage(int testscoresum, int testscorecount) {
        double AverageSoFar = (double) testscoresum / (double) testscorecount;
        System.out.println("Current average of test scores: " + AverageSoFar);
    }
}