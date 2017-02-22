public class ForLoop {

	public static void main(String[] args) {
		System.out.println(Factorial(10));
		System.out.println(Facotiral(7));
		System.out.println(Fact(2));

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
	
	public static int Fact (int i) {
		int fact = 1;
		for (int x = 0; i > x; i--) {
			fact *= i;
		}
		return fact;
	}
}
