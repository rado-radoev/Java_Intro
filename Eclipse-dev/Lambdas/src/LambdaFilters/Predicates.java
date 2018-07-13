package LambdaFilters;

import java.util.function.Predicate;

public class Predicates {

	public static Predicate<Person> ageGreaterThan(int minAge) {
		return p -> p.getAge() > minAge;
	}

	public static Predicate<Person> salaryGreaterThan(int minSalary) {
		return p -> p.getSalary() > minSalary;
	}

	public static Predicate<Person> femaleGender() {
		return p -> p.getGender().toLowerCase().equals("female");
	}

}
