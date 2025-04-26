import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runner {
        public static void main(String[] args)
        {
            String input;     // To hold input
            int questions;    // Number of questions
            int missed;       // Number of questions missed

            // Get the number of questions on the exam
            while (true) {
                try {
                    input = JOptionPane.showInputDialog("How many questions are on the exam?");
                    questions = Integer.parseInt(input);
                    if (questions == 0) {
                        System.out.println("0 is not an option.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Please input a valid input");
                }
            }

            // Get the number of questions the student missed
            while (true) {
                try {
                    input = JOptionPane.showInputDialog("How many questions did the student miss?");
                    missed = Integer.parseInt(input);
                    break;
                } catch (Exception e) {
                    System.out.println("Please input a valid input");
                }
            }

            // Create an Exam object
            Exam exam = new Exam(questions, missed);

            // Display the test results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();
            JOptionPane.showMessageDialog(null, message);

            System.exit(0);
        }
    }


