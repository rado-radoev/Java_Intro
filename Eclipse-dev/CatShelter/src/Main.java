/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter cat name: ");
		String catName = scanner.nextLine();
		scanner.close();
		
		Cat cat = new Cat(catName);
		
		System.out.printf("Your cat name is: %s", cat.name);
		
	}

}
