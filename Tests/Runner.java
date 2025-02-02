import java.text.DecimalFormat;
import java.util.Scanner;

public class Tests {
    private int testscorenum; // Private fields
    private float testscoreaverage;
    // Default Constructor
    public Tests() {
        this.testscorenum = testscorenum;
        this.testscoreaverage = testscoreaverage;
    }

    // gets result to be printed
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##"); // Initializing decimal format method
        return "The average of the " + this.testscorenum + " scores entered is: " + df.format(this.testscoreaverage);
        // Average will be formatted with 2 decimals thanks to df
        // if 0 / 0 , then NaN will be printed because that aint no number
    }

    // Set new values
    public void settestscore(int newtestscorenum, float newtestscoreaverage) {
        this.testscorenum = newtestscorenum;
        this.testscoreaverage = newtestscoreaverage;
    }

    //
    public static float getAverage(float testscoresum, int testscorenum) {
        return testscoresum / testscorenum;
    }
    public static void main(String[] args) {
        Scanner testscoregetter = new Scanner(System.in); // New scanning system
        int TestScoreNum = 0;
        float TestScoreSum = 0;
        Tests testscoreobject = new Tests();
        while (true) {
            System.out.println("What is the score for test " + (TestScoreNum + 1) + "?" + " Input -1 to quit.");
            // Asks score for each test score depending on what test # we're on
            float testscore = testscoregetter.nextFloat();
            if (testscore == -1) {
                break; // Breaks out of loop if input was -1
            } else {
                TestScoreNum++;
                TestScoreSum += testscore;
            }
        }
        float TheAverage = getAverage(TestScoreSum,TestScoreNum);
        testscoreobject.settestscore(TestScoreNum,TheAverage); // Set results to be printed
        System.out.println(testscoreobject); // Using toString()
    }
}
