
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {5,1,4,2,8};
		bubbleSort(arr, arr.length);

	}

	private static int[] bubbleSort (int[] list, int lenght) {
		boolean swap = true;
		int temp;
		
		while (swap) {
			swap = false;
			
			for(int i = 0; i < list.length - 1;i++) {
				if (list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					swap = true;
				}
			}
		}
		
		return list;
	}
	
}
