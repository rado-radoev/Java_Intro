
public class MyFibonacci {

	public static void main(String[] args) {
		Factorial1(10);


	}
	
	public static void Factorial (int n) {
		int first = 0;
		int second = 1;
		int next = 0;
		
		for (int i = 0; i <= n; i ++) {
			if (i <= 1) {
				next = i;
			}
			else {
				next = first + second;
				first = second;
				second = next;
			}
			System.out.println(next);
		}
		
	}

	public static void Factorial1 (int n) {
		int first = 0;
		int second = 1;
		int next = 0;
		int i = 0;
		
		while (i <= n) {
			if (i <= 1) {
				next = i;
			}
			else {
				next = first + second;
				first = second;
				second = next;
			}
			System.out.println(next);
			i++;
		}
	}
}
