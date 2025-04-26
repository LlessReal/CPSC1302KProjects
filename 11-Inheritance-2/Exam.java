public class Exam extends Assessment {
    private int numQuestions;    // Total number of questions
    private double pointsEach;   // Points for each question
    private int numMissed;       // Number of questions missed

    public Exam(int questions, int missed) {
        if (questions <= 0) {
            throw new IllegalArgumentException("Number of questions must be positive");
        }
        if (missed < 0 || missed > questions) {
            throw new IllegalArgumentException("Missed questions must be between 0 and total questions");
        }

        this.numQuestions = questions; this.numMissed = missed;
        // Calculate points per question by dividing 100 by the total amount of questions
        this.pointsEach = 100.0 / questions;

        // Removes points based on how many missed
        double numericScore = 100.0 - (missed * pointsEach);
        setScore((int) numericScore); // Store as integer per Assessment class
    }

    // Return points for each question
    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }
}