// https://www.codewars.com/kata/find-the-odd-int/train/java
import java.util.HashMap;



public class FindOdd {

	public static void main(String[] args) {
		
		int[] a = {1,1,1,1,1,1,10,1,1,1,1};
		System.out.print(findIt(a));

	}

	public static int findIt(int[] A) {
		HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();

		for (int i : A) {
			if (!myHashMap.containsKey(i)) {
				myHashMap.put(i, 1);
			}
			else {
				myHashMap.put(i, myHashMap.get(i) + 1);
				//System.out.println("Adding " + i + " with value " + myHashMap.get(i));
			}
		}

		for (int key : myHashMap.keySet()) {
			if (myHashMap.get(key) % 2 != 0) {
				return key;
			}
		}
		return myHashMap.get(0);
	  }
}

