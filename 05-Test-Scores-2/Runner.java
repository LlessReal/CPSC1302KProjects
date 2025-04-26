import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner testscoregetter = new Scanner(System.in); // New scanning system
        Tests testscoreobject = new Tests();
        int TestScore = 0;
        int TestCount = 0;
        while (true) {
            System.out.println("What is the score for test " + (testscoreobject.getCount() + 1) + "?" + " Input -1 to quit.");
            // Asks score for each test score depending on what test # we're on
            int testscore = testscoregetter.nextInt(); // Prompts intteger input
            if (testscore == -1) {
                break; // Breaks out of loop if input was -1
            } else {
                TestScore += testscore; // Add to total
                testscoreobject.setScore(TestScore); // Sets that to the the score (also adds count and gets average)
                System.out.println("Count so far is " + testscoreobject.getCount()); // Display count
                testscoreobject.getAverage(); // Displays average
                // 100  95  90  85  80  75  1
            }
        }
        System.out.println(testscoreobject); // Using toString()
    }
}
