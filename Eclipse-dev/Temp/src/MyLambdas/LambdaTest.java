package MyLambdas;

import java.io.PushbackInputStream;

public class LambdaTest {

	public static void main(String[] args) {
		
		// Do arithmetics with two integers
		// Lambda straight into Syso. This will invoke the lambda straight from the print statement
		// Sums a + b with the numbers after the comma
		System.out.println(intsCalc((a, b) -> a + b, 10, 20));
		
		// Create instance of the interface
		DoubleIntegerArithmetics doubIntArith = (a, b) -> a + b;
		
		// Call the method with parameter the interface instance, and two digits instead of a & b
		intsCalc(doubIntArith, 5, 15);
		
		// Display the method in system out print
		System.out.println(intsCalc(doubIntArith, 5, 15));
		
		// This method will print a black hole lambda
		// Create instance of the balck hole interface
		BlackHole blackH = () -> System.out.println("This goes into the balck whole");
		putInBlackWhole(blackH);
		
		// This method will print another black whole lambda but with parameters
		ParameterBlackHole paramBlackHo = s -> System.out.println(s);
		disposeInParameterizedBlackHole(paramBlackHo, "This is string parameter that goes into the black hole");

	}
	
	// method for DoubleIntegerArithmetics interface
	public static int intsCalc(DoubleIntegerArithmetics dia, int a, int b) {
		return dia.calculate(a, b);
	}
	
	// implement method for the BlackHole interface
	public static void putInBlackWhole(BlackHole bh) {
		bh.execute();
	}
	
	// implementation method for the ParameterBlackHole
	public static void disposeInParameterizedBlackHole (ParameterBlackHole pbh, String s) {
		pbh.dispose(s);
	}
	
	// implement method for IntToDouble interface
	public static double convertIntToDouble (IntToDouble convertInt, int a) {
		return convertInt.convert(a);
	}
}
