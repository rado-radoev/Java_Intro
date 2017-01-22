package Greetings;
import java.util.function.BinaryOperator;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		Greeting hellowWorldGreeitng = new HelloWorldGreeting();
		Greeting lambdaGreeting = () -> System.out.print("Hello World!");
		
		
		BinaryOperator<Integer> addFunc = (a, b) -> a +b;
		BinaryOperator<Integer> addFunction = (a, b) -> a + b;
		BinaryOperator<Integer> safeDivideFunction = (a, b) -> b == 0 ? 0 : a / b;
		
		
		greeter.greet(lambdaGreeting);
	}
	
}

