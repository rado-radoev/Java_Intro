
public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] arr = {7,9,2,4,8,5,1,3,6,0};
		is.sort(arr);
	}
	
	// Loop through the array
	// Check the number at that index
	// if the previous number is higher than the number on the current index
	// swap the numbers
	// Do this in the inner loop until either the beginning of the array is reached or the current number is 
	// higher than the previous
	public int[] sort(int arr[]) {
		for (int x = 1; x < arr.length; x++) {
			for (int y = x; y > 0 && arr[y-1] > arr[y]; y--) {
				int t = arr[y];
				arr[y] = arr[y-1];
				arr[y-1] = t;
			}
		}
		return arr;
	}
}
