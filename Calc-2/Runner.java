//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        //instantiate a Calc object
        Calc myCalculator = new Calc();
        //get user input for two numbers
        Scanner scan = new Scanner(System.in);
        while (true) { // While loop to get user's input
            try {
                System.out.println("Please enter the first number: ");
                double n1 = scan.nextDouble(); // Ask for the double, if error occurs, catch thing will happen beloow
                myCalculator.setNum1(n1);
                break;
            }
            catch(Exception e) {
                System.out.println("Just enter a number you monkey");
                scan.next(); // Gets rid of unecessary enter character to avoid infinite loop
            }
        }

        while (true) {
            try {
                System.out.println("Please enter the second number: ");
                double n2 = scan.nextDouble();
                myCalculator.setNum2(n2);  //pass the numbers to the Calc object
                break;
            }
            catch(Exception e) {
                System.out.println("Just enter a number you monkey");
                scan.next(); // Gets rid of unecessary enter character to avoid infinite loop
            }
        }

        //output from Calc instance
        System.out.println(myCalculator);

        //examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods directly
        //can use a local variable for sum if you need that value for another calculation
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //or if you don't, then just display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
