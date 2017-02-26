package MyLambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas_2_Condition {
	
	

	public static void main(String[] args) {
		List<MyLambdaPerson> people = Arrays.asList(
				new MyLambdaPerson("Charles", "Dicketns", 60),
				new MyLambdaPerson("Lewis", "Carrol", 42),
				new MyLambdaPerson("Thomas", "Carlyle", 51),
				new MyLambdaPerson("Charlotte", "Bronte", 45),
				new MyLambdaPerson("Matthew", "Arnold", 39)			
				);

		// Step 1: Sort list by name;
		Collections.sort(people, new Comparator<MyLambdaPerson>() {

			@Override
			public int compare(MyLambdaPerson o1, MyLambdaPerson o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		// Step 2: Create a method that prints all elements in the list
		
		printAll(people);
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		printConditionally(people, new Condition(){

			@Override
			public boolean test(MyLambdaPerson p) {
				return p.getLastName().startsWith("C");	
			}
			
		});
	}

	private static void printConditionally(List<MyLambdaPerson> people, Condition condition) {
		for (MyLambdaPerson p : people) {
			if (condition.test(p)){
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<MyLambdaPerson> people) {
		for (MyLambdaPerson p : people) {
			System.out.println(p);
		}
	}
}

interface Condition{
	boolean test(MyLambdaPerson p);
}
