
public class Memorization {

	public static void main(String[] args) {

	}
	
	public static int fib (int n, int[] memo) {
		if (n <= 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			memo[n] = fib(n - 1) + fib(n -2);
		}
		return memo[n];
	}

}
