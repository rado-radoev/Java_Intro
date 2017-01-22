package Greetings;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		printLambda(s -> s.length());
	}
	
	public static void printLambda(StringLenghtLambda l) {
		System.out.print(l.getlenght("Hello World"));
	}
	
	interface StringLenghtLambda {
		int getlenght(String s);
	}
}


