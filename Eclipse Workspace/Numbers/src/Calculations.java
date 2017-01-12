/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */

import java.util.Scanner;

public class Calculations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** Create new scanner object.*/
		Scanner scanner = new Scanner(System.in);
		
		/** Initialize variables.*/
		int average, sum, product, smallest, largest;
		int number1, number2;
		
		/** Grab user input.*/
		System.out.println("Enter two digits and I will show you sum, "
				+ "average, product, smallest and lowest");
		
		System.out.printf("Enter first number: ");
		number1 = scanner.nextInt();			
		System.out.printf("Enter second number: ");
		number2 = scanner.nextInt();
		
		/** Make calculations.*/
		sum = number1 + number2;
		average = sum / 2;
		product = number1 * number2;
		smallest = Math.min(number1, number2);
		largest = Math.max(number1, number2);
		
		/** Output calculations.*/
		System.out.printf("The sum of %s and %s is: %s\n", number1, number2, sum);
		System.out.printf("The average of %s and %s is: %s\n", number1, number2, average);
		System.out.printf("The product of %s and %s is: %s\n", number1, number2, product);
		System.out.printf("The smallest of %s and %s is: %s\n", number1, number2, smallest);
		System.out.printf("The largest of %s and %s is: %s\n", number1, number2, largest);
		
		/** Close scanner object.*/
		scanner.close();

	}

}
