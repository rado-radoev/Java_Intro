package Greetings;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.print("Hello World");
	}
}
