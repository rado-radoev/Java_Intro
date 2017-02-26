package MyLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas_2_Lambda {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<MyLambdaPerson> people = Arrays.asList(
				new MyLambdaPerson("Charles", "Dicketns", 60),
				new MyLambdaPerson("Lewis", "Carrol", 42),
				new MyLambdaPerson("Thomas", "Carlyle", 51),
				new MyLambdaPerson("Charlotte", "Bronte", 45),
				new MyLambdaPerson("Matthew", "Arnold", 39)			
				);

		// Step 1: Sort list by name;
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		// Step 2: Create a method that prints all elements in the list
		
		System.out.println("Print all people");
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrint all people with last name beginning with C");
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
		System.out.println("\nPrint all people with first name beginning with C");
		performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
	}
	
	
	

	private static void performConditionally(List<MyLambdaPerson> people, Predicate<MyLambdaPerson> predicate, Consumer<MyLambdaPerson> consumer) {
		for (MyLambdaPerson p : people) {
			if (predicate.test(p)){
				consumer.accept(p);;
			}
		}
		
	}

}

