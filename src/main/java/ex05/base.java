/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 5 - Mad Lib
 *  Write a program that prompts for two numbers. Print the sum,
 *  difference, product, and quotient of those numbers as shown
 *  in the example output:
 *
 *  Constraint:
 *  Values coming from users will be strings. Ensure that you convert
 *  these values to numbers before doing the math.
 *  Keep the inputs and outputs separate from the numerical conversions
 *  and other processing.
 * Generate a single output statement with line breaks in the appropriate spots.
 *
 */

package ex05;
import java.util.Scanner;

public class base {
    public static void main(String [] args)
    {
        Scanner userInput = new Scanner(System.in);
        String numOne,numTwo;
        int add,sub,mult,div;

        System.out.printf("What is the first number? ");
        numOne = userInput.nextLine();

        System.out.printf("What is the second number? ");
        numTwo = userInput.nextLine();

        add = Integer.parseInt(numOne) + Integer.parseInt(numTwo);
        sub = Integer.parseInt(numOne) - Integer.parseInt(numTwo);
        mult = Integer.parseInt(numOne) * Integer.parseInt(numTwo);
        div = Integer.parseInt(numOne) / Integer.parseInt(numTwo);

        System.out.printf(numOne + " + " + numTwo + " = " + add + "%n" + numOne + " - " + numTwo + " = " + sub + "%n" + numOne + " * " + numTwo + " = " + mult + "%n" + numOne + " / " + numTwo + " = " + div);

    }
}