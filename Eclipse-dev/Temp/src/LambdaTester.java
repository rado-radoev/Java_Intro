
public class LambdaTester {
	
	@FunctionalInterface
	interface MathOperation {
		int operator(int a, int b);
	}
	
	interface GreetingService {
		void SayMessage(String message);
	}
	
	interface Buy {
		void BuyBottle(String message);
	}

	public static void main(String[] args) {
				
		System.out.print("10 + 5 = " + Operator((a, b) -> a + b,10,5) + "\n");
		System.out.printf("10 + 5 = %s%n", Operator((int a, int b) -> b / a,10,5));
	}
	
	
	static void BuyBottle(Buy b, String message) {
		b.BuyBottle(message);
	}
	
	static int Operator(MathOperation mathOp, int a, int b){
		return mathOp.operator(a, b);
	}
	

}
