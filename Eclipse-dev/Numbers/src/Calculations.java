/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/** Create new scanner object.*/
		Scanner scanner = new Scanner(System.in);
		
		/** Grab user input.*/
		System.out.println("Enter two digits and I will show you sum, "
				+ "average, product, smallest and lowest");
		
		System.out.printf("Enter first number: ");
		int number1 = scanner.nextInt();			
		System.out.printf("Enter second number: ");
		int number2 = scanner.nextInt();	
		System.out.printf("Enter third number: ");
		int number3 = scanner.nextInt();	
		
		/** Close scanner object.*/
		scanner.close();
		
		List<Integer> list = new ArrayList<>();
			list.add(Number2.Calculator(number1, number2, number3, (a,b,c) -> a + b + c));
			list.add(Number2.Calculator(number1, number2, number3, (a,b,c) -> (a + b + c) / 3));
			list.add(Number2.Calculator(number1, number2, number3, (a,b,c) -> a * b * c));
			list.add(Number2.Calculator(number1, number2, number3, (a,b,c) -> {
				int smallest1 = Math.min(a,b);
				int smallest2 = Math.min(smallest1,c);
				return smallest2;
			}));
			list.add(Number2.Calculator(number1, number2, number3, (a,b,c) -> {
				int largest1 = Math.max(a, b);
				int largest2 = Math.max(largest1, c);
				return largest2;
			}));
		
		list.parallelStream()
		.forEach(System.out::println);
		

	}
}
