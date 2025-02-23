/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author maver
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner MyObj = new Scanner(System.in);
       
        boolean yes = true;
       



        while (yes) {
            try {
                System.out.print("Enter the number: ");
                int n = MyObj.nextInt();
           
                if (n <= 0) {
                    System.out.println("Please enter a positive number not equal to zero");
                } else {
                    System.out.print("Fibonacci Series for the first " + n + " numbers: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(fib(i) + " ");
                    }
                    System.out.println();

                    // Asking the user if they want to continue
                    System.out.print("Type 1 to continue or any other key to exit: ");
                    int flag = MyObj.nextInt();
                    if (flag != 1) {
                        yes = false; // Exit the program if the user does not type 1
                    }
                }
               
            } catch (Exception e)  {
                System.out.println("invalid number. Please enter a positive number not equal to zero");
                MyObj.nextLine();            
            }

        }

        System.out.println("Goodbye!");
        MyObj.close();
   
       
    }

 // Recursive method to find Fibonacci number
    public static int fib(int n) {
        if (n <= 1) {
            return n; // Base case: fib(0) = 0, fib(1) = 1
        } else {
            return fib(n - 1) + fib(n - 2); // Recursive call for fib(n-1) and fib(n-2)
        }
    }
}
