package Lamdas;

import java.util.function.Consumer;

public class LambdaTests2 {

	public static void main(String[] args) {
		
		DisplayOnScreen disp = () -> System.out.println("Display On screen without parameters");
		display(disp);
		
		Consumer<String> str = (s) -> System.out.println(s);
		consumer(str, "Ello");
		
		
		BinaryCalculator calculate = (a, b) -> a + b;
		System.out.println(calculat((a, b) -> a - b,10,5 ));
		
		
		UnaryCalculator unar = a -> a + 5;
		int x = 25;
		System.out.println(unaryCalc(unar, x));
		
		PrintString prt = (s) -> System.out.println(s);
		print(prt, "hello");
		
		System.out.println(tripleCalc((a, b, c) -> a + b +c, 10,20,30));
		TripleCalc calcTriple = (a, b, c) -> a + b + c;
		System.out.println(tripleCalc(calcTriple, 1, 2, 3));
		
		
//		PrintScr ps = () -> System.out.println("Hollaaa");
//		printDisplay(ps);
		
		
		PrintScr pt = () -> System.out.print("Ello mate");
		printDisplay(pt);
		
	}
	
	public static void display(DisplayOnScreen displayOnScreen) {
		displayOnScreen.display();
	}
	
	public static void consumer(Consumer<String> str, String s) {
		str.accept(s);
	}
	
	public static int calculat(BinaryCalculator calc, int a, int b) {
		return calc.calculate(a, b);
	}
	
	public static int unaryCalc(UnaryCalculator ucalc, int a) {
		return ucalc.unary(a);
	}
	
	public static void print(PrintString prtStr, String s) {
		prtStr.print(s);
	}

	public static int tripleCalc(TripleCalc triCalculator, int a, int b, int c) {
		return triCalculator.triple(a, b, c);
	}

	public static void printDisplay(PrintScr prtScr) {
		prtScr.printDisplay();
	}

}
