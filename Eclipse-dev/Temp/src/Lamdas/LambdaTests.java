package Lamdas;

import java.util.function.Consumer;

public class LambdaTests {
    public static void main(String[] args) {

       BinaryCalculator addFunction = (a, b) ->  a + b;
       
       BinaryCalculator divideFunction = (a,b) -> b == 0 ? 0 : a / b;
       
       Consumer<String> displayText = (s) -> System.out.println("helooooo");
    
       LambdaTests.display(displayText,"");
       	
       System.out.println(calculate((a, b) -> a + b,18,35));
       System.out.println(LambdaTests.calculate(addFunction, 5, 20));
       
       System.out.println(LambdaTests.calculate(divideFunction, 15, 5));
       System.out.println(calculate((a,b) -> a / b,15,35));
    }
    
    public static int calculate (BinaryCalculator calc, int a, int b) {
    	return calc.calculate(a, b);
    }
    
    public static void display(Consumer<String> consumer, String s) {
    	consumer.accept(s);
    }
    
}
