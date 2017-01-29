
public class ForLoop {

	public static void main(String[] args) {
		int number = 10; // this is the fibonacci number
		int i = 0;	// index will be starting from
		int firstValue = 0; // first value of fibonacci sequence
		int secondValue = 1; // second value of fibonacci sequence
		int Next;	// this will calculate the next value in the fibonacci sequnece
		
		for (i = 0; i <= number; i++) {
			if (i <= 1) {
				Next = i;
			}
			else {
				Next = firstValue + secondValue;
				firstValue = secondValue;
				secondValue = Next;
			}
			System.out.println(Next);
		}
	}
}
