
public class While {

	public static void main(String[] args) {
		fact(10);

	}
	
	public static void fact (int n) {
		int fact = 1;
		while (true) {
			if (n == 1) {
				break;
			}
			
			fact *= n;
			n--;
		}
		
		System.out.println(fact);
	}

}
