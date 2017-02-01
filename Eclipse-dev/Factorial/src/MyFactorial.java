
public class MyFactorial {

	public static void main(String[] args) {
		System.out.println(Fact(10));

	}
	
	public static int Fact (int n) {
		int fact = 1;
		for (int i = n; i > 1; i--) {
			fact *= i;
		}
		
		return fact;
	}

}
