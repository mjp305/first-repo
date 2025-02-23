/*
This code is to create a calculator with several functions
 */
package calculator;


import java.util.Scanner;

/**
 *
 * @author maver
 */
public class Calculator {

   
   
   
    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Method to find maximum
    public static double findMax(double a, double b) {
        return (a > b) ? a : b;
    }

    // Method to find minimum
    public static double findMin(double a, double b) {
        return (a < b) ? a : b;
    }

    // Method to generate a random number
    public static double generateRandom(double a, double b) {
       
        double randomNumber = Math.random()*(b - a) + a;

        return randomNumber; // Generates a random number between 0 and 100
    }
   


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            double num1, num2;
           
            System.out.println("Choose an option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Maximum");
            System.out.println("6. Minimum");
            System.out.println("7. Random");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");

            }

            if (choice >= 1 && choice <= 7) {
               
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
            } else {
                num1 = 0;  // Random number doesn't require two numbers
                num2 = 0;
            }

                try {
                    switch (choice) {
                        case 1 -> System.out.println("Addition: " + num1 + " + " + num2 + " = " + add(num1, num2));
                        case 2 -> System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + subtract(num1, num2));
                        case 3 -> System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiply(num1, num2));
                        case 4 -> System.out.println("Division: "+ num1 + " / " + num2 + " = "  + divide(num1, num2));
                        case 5 -> System.out.println("Maximum Number is: " + findMax(num1, num2));
                        case 6 -> System.out.println("Minimum Number is: " + findMin(num1, num2));
                        case 7 -> System.out.println("Random Number between " + num1 + " and " + num2 + " : " + (int)generateRandom(num1, num2));
                        default -> System.out.println("Invalid choice. Try again.");
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } catch( Exception e) {
                System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
   
}
