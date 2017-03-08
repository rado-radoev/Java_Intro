import java.util.ArrayList;



public class FindOdd {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = 1;
			a[i] = i + 2;
		}
		
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		

		for (int i : a) {
			if (i % 2 != 0) {
				boolean added = newArray.add(i);
				System.out.println(added);				
			}
		}
		
		/**
		 * Create hash map<Integer, Integer>
		 * Loop through the array
		 * if a number is odd
		 * add it to the hash map
		 * add value of 1
		 * return a boolean while adding number to hashmap
		 * if the return value is false, the number is already in the hashmap
		 * iterate through the hash map and find the key 
		 * add 1 to the value
		 * do this with all odd elements in the array
		 * 
		 * 
		 * when you have to return the number of odd numbers
		 * iterate through the hash map
		 * grab the key and the max value in separate variables
		 * Check if the next key value is higher
		 * if it is higher then write the new key value and the new value value to the
		 * variables.
		 * if not higher move to the next.
		 * return the key
		 */
		
		
		
	}
	
	public static int findIt(int[] A) {
		// Loop through the array and find a number that appears odd number of times
		
		
		
		
	  	return 0;
	  }

}
