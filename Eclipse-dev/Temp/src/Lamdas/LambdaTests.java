package Lamdas;
@FunctionalInterface
interface BinaryCalculator {
	int calculate(int a, int b);
}

interface DisplayOnScreen {
	void display();
}

public class LambdaTests {
    public static void main(String[] args) {

       BinaryCalculator addFunction = (a, b) ->  a + b;
       DisplayOnScreen dispOnScr = () -> System.out.print("hello");
       
    	
       System.out.println(calculate((a, b) -> a + b,18,35));
       System.out.println(LambdaTests.calculate(addFunction, 5, 20));
       
       
    }
    
    public static int calculate (BinaryCalculator calc, int a, int b) {
    	return calc.calculate(a, b);
    }
    
//    public static void display (DisplayOnScreen disp) {
//    	System.out.print(disp.display("Hello World"));
//    }
}