import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		// Print menu options
		Runnable languages = () -> {
			System.out.println("1. SQL");
			System.out.println("2. Java");
			System.out.println("3. JavaScript");
			System.out.println("4. Python");
			System.out.println("5. C#");
			System.out.println("6. Ruby");
		};
		
		// Display main menu
		System.out.println("Choose your prefered programming language:\n");
		languages.run();
		System.out.println("\nType 'exit' to quit.");
		
		// Lambda expression for shorter println
		Consumer<String> disp = s -> System.out.println(s);
		
		// Lambda expression to check strings values for equality
		BiPredicate<String, String> compare = (str1, str2) -> str1.equals(str2);
		
		// Instantiate scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.print("Which language do you choose?: ");
		String usrLang = scanner.nextLine().toLowerCase();
		
		// Loops through choices while user enters exit
		while (compare.negate().test(usrLang, "exit")) {
			if (compare.and(compare).test(usrLang, "sql")) {
				disp.accept("Good choice!");
			}
			else if (compare.and(compare).test(usrLang, "java")) {
				disp.accept("Awesome!");
			} 
			else if (compare.and(compare).test(usrLang, "javascript")) {
				disp.accept("Even better!");
			}
			else if (compare.and(compare).test(usrLang, "python")) {
				disp.accept("Excellent decision!");
			}
			else if (compare.and(compare).test(usrLang, "c#")) {
				disp.accept("Best language!");
			}
			else if (compare.and(compare).test(usrLang, "ruby")) {
				disp.accept("Are you sure?");
			}
			else {
				disp.accept("Choose from one of the displayed languages.");
				languages.run();
			}
			System.out.print("Choose another language: ");
			usrLang = scanner.nextLine().toLowerCase();
		}
		
		disp.accept("\n --- Terminating program ---");
		disp.accept("Goodbye!");
		
		
		
		// Close scanner object
		scanner.close();
	}

}
