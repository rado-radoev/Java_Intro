import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		// Declare three numbers
		// Note how this can be done in one line
		int number1, number2, number3;
		
		// read numbers from user
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		System.out.print("Enter third number: ");
		number3 = input.nextInt();
		
		// Sum
		int sum = number1 + number2 + number3;
		System.out.println("Sum is:" + sum);
		
		// Average
		int average = (number1 + number2 + number3)/3;
		System.out.println("Average is: " + average);
		
		// Min
		int minNum = Math.min(Math.min(number1, number2), number3);
		System.out.println("Minimum is: " + minNum);
		
		// Max
		int maxNum = Math.max(Math.max(number1, number2), number3);
		System.out.println("Maximum is: " + maxNum);

	}

}
