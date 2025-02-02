import java.text.DecimalFormat;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner testscoregetter = new Scanner(System.in); // New scanning system
        Tests testscoreobject = new Tests();
        int TestScore = testscoreobject.score;
        int TestCount = testscoreobject.count;
        while (true) {
            System.out.println("What is the score for test " + (testscoreobject.count + 1) + "?" + " Input -1 to quit.");
            // Asks score for each test score depending on what test # we're on
            int testscore = testscoregetter.nextInt();
            if (testscore == -1) {
                break; // Breaks out of loop if input was -1
            } else {
                testscoreobject.count++;
                TestCount = testscoreobject.count;
                //System.out.println(TestCount);
                testscoreobject.setScore(testscore);
                TestScore += testscoreobject.score;
                //System.out.println(TestScore);
                getAverage(TestScore,TestCount);
                // 100  95  90  85  80  75  1
            }
        }
        testscoreobject.ave = (double) TestScore / (double) TestCount;
        System.out.println(testscoreobject); // Using toString()
    }
}
