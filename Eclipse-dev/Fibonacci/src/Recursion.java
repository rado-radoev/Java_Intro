
public class Recursion {

	public static void main(String[] args) {
		System.out.println(Fibonacci(10));
	}
	
	public static int Fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return Fibonacci(n - 2) + Fibonacci(n - 1);
		}
	}

}
