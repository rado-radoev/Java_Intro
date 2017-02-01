import java.util.Scanner;
public class Primes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int num = scanner.nextInt();
		int divider = 2 ; // used for possible divider for the number
		
		// max possible divider. If there is a divider larger than num sqrt
		// there should be a divider lower then num sqrt
		// We don't have go check for a lower divider.
		// limit number of iterations
		int maxDivider = (int)Math.sqrt(num); 
		boolean prime = true; // Change to false if num has a divider
		while (prime && (divider <= maxDivider)) {
			if (num % divider == 0) {
				prime = false;
			}
			divider++;
		}
		System.out.println("Prime? " + prime);
	}
}
