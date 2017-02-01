
public class DoWhile {

	public static void main(String[] args) {
		Fact(10);

	}
	
	public static void Fact (int n) {
		int fact = 1;
		do {
			fact *= n;
			n--;
		} while (n > 0);
		
		System.out.println(fact);
	}

}
