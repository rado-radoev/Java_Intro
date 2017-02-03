
public class IntegerSum {

	public static void main(String[] args) {
		int n = 123;

//		For n = 111, the output should be
//
//				digitSum(n) = 3.
//
//				1 + 1 + 1 = 3.
// 				break the ineger in single digits 
// 				sum them

	}
	

	
	public static int BreakInt (int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

}
