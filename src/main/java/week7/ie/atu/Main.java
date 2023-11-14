package week7.ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x=1;
        while(x==1) {
            try {
                System.out.println("Please enter a number between 0 - 9 : ");
                Scanner myscan = new Scanner(System.in);

                //read user input as a string
                String input = myscan.nextLine();

                //parse the input to an interger
                int myNum = Integer.parseInt(input);

                //check if the number is between 0 and 9
                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum + "\n");
                    x=2;
                }
                else {
                    System.out.println("Not a valid number\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid numeric value\n");
            }
        }
    }
}