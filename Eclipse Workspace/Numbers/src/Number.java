/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */
public class Number {
	
	public Number () {}
	
	/**
	 * Print the sum of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 * @param number3	Number three
	 */
	public static void Sum (int number1, int number2, int number3) {
		int sum = number1 + number2 + number3;
		System.out.printf("The sum of %s, %s and %s is: %s\n", number1, number2, number3, sum);
	}
	
	/**
	 * Print the average of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 * @param number3	Number three
	 */
	public static void Average (int number1, int number2, int number3){
		int average = (number1 + number2 + number3) / 3;
		System.out.printf("The average of %s, %s and %s is: %s\n", number1, number2, number3 ,average);
	}
	
	/**
	 * Print the product of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 * @param number3	Number three
	 */
	public static void Product (int number1, int number2, int number3) {
		int product = number1 * number2;
		System.out.printf("The product of %s, %s and %s is: %s\n", number1, number2, number3 ,product);
	}
	
	/**
	 * Print the minimum of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 * @param number3	Number three
	 */
	public static void Min (int number1, int number2, int number3) {
		int smallest1 = Math.min(number1, number2);
		int smallest = Math.min(smallest1, number3);
		System.out.printf("The smallest of %s, %s and %s is: %s\n", number1, number2, number3 ,smallest);
	}
	
	/**
	 * Print the maximum of two numbers
	 * @param number1	Number one
	 * @param number2	Number two
	 * @param number3	Number three
	 */
	public static void Max (int number1, int number2, int number3) {
		int largest1 = Math.max(number1, number2);
		int largest = Math.max(largest1, number3);
		System.out.printf("The largest of %s, %s and %s is: %s\n", number1, number2, number3, largest);
	}
	
}

	

