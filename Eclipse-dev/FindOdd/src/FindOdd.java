// https://www.codewars.com/kata/find-the-odd-int/train/java
import java.util.HashMap;
import java.util.Random;


public class FindOdd {

	public static void main(String[] args) {
		Random rnd = new Random(30);
		HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();
		
		
		
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt();
		}


		for (int i : a) {
			if (i % 2 != 0) {
				if (!myHashMap.containsKey(i)) {
					myHashMap.put(i, 1);
				}
				else {
					myHashMap.get(i);
				}
				
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
