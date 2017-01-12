/**
 * 
 */

/**
 * @author Radoslav Radoev
 */

import java.util.Scanner;

public class SeparateNumbers {
	/***
	 * Initialize number
	 */
	int number = 0;
	
	
	 /***
	  * Default constructor
	  */
	public SeparateNumbers() {}
	
	/***
	 * Output single digits from number
	 * @param number	Number entered by user
	 */
	public static void OutputDigits (int number) {
		if (number < 10) {
			System.out.printf("%s", number);
			return;
		}
		OutputDigits(number / 10);
		System.out.printf("   %s", number % 10);
	}
	
	/***
	 * Ask user for a number
	 * @return	Returns number entered by the user
	 */
	public static int GetNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter five digit number: ");
		int number = scanner.nextInt();

		scanner.close();
		
		return number;
	}

}
