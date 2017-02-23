
public class Factorial {

	public static void main(String[] args) {
		// Factorial can only be calculated on positive integers
		System.out.println(Factorial(0));

	}
	
	public static int Factorial(int i) {
		// If the number we are trying to find the factorial is 0 or 1, factorial is always 1
		if (i == 0 || i == 1) {
			return 1;
		} else {
			// Calculate factorial by multiplying the number to the one before it
			return i * Factorial(i - 1);
		}
		
	}

}
