
public class MergeSort {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		
		int[] array = {6,3,11,8,5,4,10,7,0,9,1,3};
		ms.sort(array);

	}
	
	public void sort(int[] arr) {
		int[] helper = new int[arr.length]; // this will be the sorted array
		mergeSort(arr, helper, 0, arr.length - 1);	// Run the merge sort, passing the unsorted array,
		// the sorted array to be, start from 0 and continue until end of array is reached
		
	}
	
	
	private void mergeSort(int[] arr, int[] helper, int low, int high) { // start splitting the array
		if (low < high) {	// split the array until there is nothing more to split
			int middle = (high + low) /2; // grab the lower bound and the upper bound and find the middle. split at the middle
			mergeSort(arr, helper, low, middle);
			mergeSort(arr, helper, middle + 1, high);
			merge(arr, helper, low, middle, high);
		}
	}
	
	private void merge(int[] arr, int[] helper, int low, int middle, int high) {
		for (int x = low; x <= high; x++) {
			helper[x] = arr[x];
		}
		
		int left = low;
		int curr = low;
		int right = middle + 1;
		
		while (left <= middle && right <= high) {
			if (helper[right] > helper[left]) {
				arr[curr++] = helper[left++];
			}
			else {
				arr[curr++] = helper[right++];
			}
		}
		
		while (left <=middle) {
			arr[curr++] = helper[left++];
		}
	}

}
