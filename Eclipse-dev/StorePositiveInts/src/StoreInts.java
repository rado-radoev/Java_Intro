import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StoreInts {

	public static void main(String[] args) {
		List<Integer> newList  = new ArrayList<Integer>();
		LinkedList<Integer> newLinkedList = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int num = 1;
				
		// Add each number the user enters to a list until the user enters 0
		// Only positive integers accepted
		while (num != 0) {
			System.out.print("Enter a number: ");
			num = scanner.nextInt();
			if (num < 0) {
				System.out.println("Only positive numbers accepted!");
				continue;
			}
			AddInts(newList, num);
		}
		
		// Close scanner object
		scanner.close();
		
		// Iterate throught the list and display all elements
		DisplayInts(newList);
	}
	
	/**
	 * Adds a number to a list
	 * @param list		List of Integers
	 * @param number	Number to add to list			
	 */
	public static void AddInts (List<Integer> list, int number) {
		if (number != 0) {
			list.add(number);
		}
	}
	
	/**
	 * Iterates through a list of Integers and displays all elements 
	 * @param list		List of Integers
	 */
	public static void DisplayInts(List<Integer> list) {
		System.out.print("Numbers you entered: ");
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

}
