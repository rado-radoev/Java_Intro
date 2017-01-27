// import the scanner library
import java.util.Scanner;

// declare the Cat class - classes always start with a capital letter
public class Cat {
	// "cat has a name" - instance variable cat
	String name; 
	
	//declare method show name
	void showName() {
		// print name - this. refers to instance variables and methods on the object
		System.out.println("Name: " + this.name);
	}
	
	// declare main method
	static public void main(String args[]) {
		// declare variable cat of type Cat
		// assign a new Object of type Cat -- 
		Cat cat = new Cat();
		
		// Scanner magic to read input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter cat name:");
		// assign the user input to the cat's name
		cat.name = scanner.nextLine();
		// call showName on the cat object
		cat.showName();
	}
}