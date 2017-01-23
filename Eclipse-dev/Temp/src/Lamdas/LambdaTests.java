package Lamdas;
@FunctionalInterface
interface BinaryCalculator {
	int calculate(int a, int b);
}

interface DisplayOnScreen {
	void display(String s);
}

public class LambdaTests {
    public static void main(String[] args) {

       BinaryCalculator addFunction = (a, b) ->  a + b;
       DisplayOnScreen displayText = s -> s = "Hello";
       
    	
       System.out.println(calculate((a, b) -> a + b,18,35));
       System.out.println(LambdaTests.calculate(addFunction, 5, 20));
       System.out.println(displayText);
       
       
    }
    
    public static int calculate (BinaryCalculator calc, int a, int b) {
    	return calc.calculate(a, b);
    }
    
    public static void display (DisplayOnScreen disp) {
//    	System.out.println(disp.display("Hello World"));
    }
}