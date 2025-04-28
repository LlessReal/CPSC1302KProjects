import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;

public class Lab8 {
    // Function that will add string data in commas to a data table
    public static String AddStringData(String[] CurrentArray, String NewItem) {
        String AddedData = ""; // Initialization
        // Add items from current array
        for (String i : CurrentArray) {AddedData += i + ","; }
        AddedData += NewItem; // Adds new item
        return AddedData + "\n";
    }

    // Function specially meant for finding the weekly pay to be added to output.csv
    public static String AddWeeklyPay(String[] CurrentArray, String PayRate, String HoursWorked) {
        String AddedData = ""; // Initialization
        // Add items from current array
        double IntPayRate = Double.parseDouble(PayRate);
        double IntHoursWorked = Double.parseDouble(HoursWorked);
        double TotalWeeklyPay = IntPayRate * IntHoursWorked;
        // If more than hours worked, multiples half of payrate times the overtime hours to get new total
        if (IntHoursWorked > 40) {
            TotalWeeklyPay += ((IntHoursWorked - 40) * (IntPayRate / 2));
        }
        String FinalTotalWeeklyPay = Double.toString(TotalWeeklyPay);
        for (String i : CurrentArray) { AddedData += i + ",";}
        AddedData += FinalTotalWeeklyPay;
        return AddedData + "\n";
    }

    public static void main(String[] args) {
        File PayData = new File("pay.csv");
        try {
            String FullDataTable = ""; // Where all data will go for the csv file
            Scanner TheReader = new Scanner(PayData); // Initalize reading file
            // Grab the heading line of the pay.csv file
            String[] CurrentArray = TheReader.nextLine().split(","); // Gets current line each time
            // Add new WeeklyPay heading
            FullDataTable += AddStringData(CurrentArray,"WeeklyPay");
            System.out.println("Added new heading in memory");
            // Add in weekly pay in the next few rows
            while (TheReader.hasNextLine()) {
                CurrentArray = TheReader.nextLine().split(",");
                FullDataTable += AddWeeklyPay(CurrentArray,CurrentArray[1],CurrentArray[2]);
            }
            TheReader.close();
            // Makes output.csv and writes data into it before closing it
            try {
                File OutPutData = new File("output.csv");
                FileWriter NewWriter = new FileWriter("output.csv");
                NewWriter.write(FullDataTable);
                NewWriter.close();
                System.out.println("Successfully wrote data into za file.,.,");
            } catch (IOException e) {
                System.out.println("An error occured.,.,");
                e.printStackTrace();
            }
        } catch(Exception e) {
            System.out.println("Failure moment");
            e.printStackTrace();
        }
    }
}