public class ForLoop {

	public static void main(String[] args) {
		System.out.println(Factorial(10));
		System.out.println(Facotiral(7));

	}
	public static long Factorial (int n) {
		long fact = 1;
		for (int x = n; x > 1; x--) {
			fact *= x;
		}
		return fact;
	}
	
	public static int Facotiral (int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
