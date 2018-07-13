package LambdaFilters;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Filter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> javaProgrammers = new ArrayList<Person>() {
			{
				add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
				add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
				add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
				add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
				add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
				add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
				add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
				add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
				add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
				add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
			}
		};

		List<Person> phpProgrammers = new ArrayList<Person>() {
			{
				add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
				add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
				add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
				add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
				add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
				add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
				add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
				add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
				add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
				add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
			}
		};

		System.out.println("Show java programmers names:");
		javaProgrammers.forEach(jp -> System.out.printf("%s %s; %n", jp.getFirstName(), jp.getLastName()));
		System.out.println();
		System.out.println("Show php programmers names:");
		phpProgrammers.forEach(pp -> System.out.printf("%s %s; %n", pp.getFirstName(), pp.getLastName()));

		System.out.println();
		System.out.println("Increase programmers salary by 5%:");
		Consumer<Person> giveRaise = p -> p.setSalary(p.getSalary() / 100 * 5 + p.getSalary());
		javaProgrammers.forEach(giveRaise);
		phpProgrammers.forEach(giveRaise);

		javaProgrammers.stream().filter(p -> p.getSalary() > 1400)
				.forEach(p -> System.out.println(p.getFirstName() + " - " + p.getSalary()));

		System.out.println();
		System.out.println("Show female php programmers that earn more than 1400 and age is greater than 25");
		phpProgrammers.stream().filter(Predicates.ageGreaterThan(25)).filter(Predicates.salaryGreaterThan(1400))
				.filter(Predicates.femaleGender()).forEach(p -> System.out.printf("%s %s - salary: %s %n",
						p.getFirstName(), p.getLastName(), p.getSalary()));

		// Reuse filters
		System.out.println();
		System.out.println("Show female java programmers older than 25");
		javaProgrammers.stream().filter(Predicates.ageGreaterThan(25)).filter(Predicates.femaleGender())
				.forEach(p -> System.out.printf("%s %s - age: %s %n", p.getFirstName(), p.getLastName(), p.getAge()));

	}

}
