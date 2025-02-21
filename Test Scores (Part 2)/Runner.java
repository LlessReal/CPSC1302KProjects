import java.util.Scanner;

public class Runner {
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
