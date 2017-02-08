package BinarySearches;

import java.util.Arrays;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = {2,4,6,7,10,23,123,5,6,87,85,567,4,4,3};
		Arrays.sort(arr);
		System.out.println(BinarySearchNoRecursion(arr, 87));
		System.out.println(binarySearch(arr, 87));

	}

	// Helper method
	public static int binarySearch(int[] a, int x) {
		return binarySearch(a, x, 0, a.length - 1);
	}
	
	// Recursion method
	private static int binarySearch(int[] a, int x, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (a[mid] == x) {
			return mid;
		}
		else if (a[mid] < x) {
			return binarySearch(a, x, mid + 1, high);
		}
		else {
			return binarySearch(a, x, low, mid -1);
		}
	}
	
	// No recursion method
	public static int BinarySearchNoRecursion(int[] a, int x) {
		int low = 0;
		int high = a.length -1;
		
		while (low < high) {
			int mid = (low + high) / 2;
			if (a[mid] == x) {
				return mid;
			}
			else if (a[mid] < x) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		if (a[low] == x) {
			return low;
		}
		return -1;
	}
}