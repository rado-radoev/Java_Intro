import java.util.Arrays;
import java.util.Random;

public class SimpleSearch {
	
	/*
	 * Declare an empty array that holds 10 ints
	 * use for loop to assign a random number to all 10 positions
	 * use while loop to perform binary search on the array and find if number 7 is in the array 
	 */

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rnd = new Random();
		
		// Assign random integers from 1 to 10 to array
		// Print whole array to screen
		System.out.print("Array contains: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// Search the array for specific number
		// Print to screen if number exists or not 
		if (BinarySearch(arr, 7)) {
			System.out.println("Number 7 exist in array!");
		}
		else {
			System.out.println("Number 7 was not found in the array!");
		}
	}
	
	/**
	 * Searches array of integers for a specific number
	 * @param array		Array of integers
	 * @param intSearch		The number to search for in the array
	 * @return		Boolean true or false depending if the value is found in the array
	 */
	public static boolean BinarySearch (int[] array, int intSearch) {
		// Sort the array, otherwise search will return odd results
		Arrays.sort(array);
		
		// Define the search range
		int start = 0;
		int end = array.length - 1;
		
		// Search algorithm
		while (start < end) {
			int middle = (start + end) / 2;
			if (array[middle] == intSearch ) {
				return true;
			}
			
			if (array[middle] < intSearch) {
				start = middle + 1;
			}
			else {
				end = middle;
			}
			
		}
		
		if (array[start] == intSearch) {
			return true;
		}
		else {
			return false;
		}
 	}

}
