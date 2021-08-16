/**
 * Import the necessary libraries
 */

import java.util.Scanner;

public class P1Q1 {

    /**
     *
     * Create the main entrypoint of the Java program
     */
    public static void main(String[] args){

        /**
         * Declare variables and declare scanner object
         */
        String name;
        int year;
        double gpa;
        Scanner scanner = new Scanner(System.in);

        /**
         * get user input
         */
        System.out.print("Enter your name:");
        name = scanner.nextLine();

        System.out.print("Enter your year of study:");
        year = scanner.nextInt();

        System.out.print("What is your target GPA for this semester?");
        gpa = scanner.nextDouble();

        System.out.println("Welcome "+ name);
        System.out.format("Work hard to achieve your target GPA of %.2f this semester of your Year %d.%n", gpa, year);


    }
}
