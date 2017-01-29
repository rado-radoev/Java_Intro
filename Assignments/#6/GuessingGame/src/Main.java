import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Random number between 1 and 10 has been generated.");
		
		
		// Generate random number between 1 and 10;
		int number = rnd.nextInt(10) + 1;
		int guess = 0;
		
		// Loop until the user guesses the number.
		// Message will be displayed if the answer is wrong and the user will be promtped
		// until he guesses right.
		while (guess != number) {
			System.out.println("Choose a number between 1 and 10: ");
			guess = scanner.nextInt();
			
			if (guess != number) {
				System.out.println("Wrong pick! Try again.");
			}
		}
		System.out.printf("Bullseye! The number was %s", number);
	}

}
