public class MinArray {
	static int arrayMinimum(int[] inputArray) {

	  int indexOfMinimum = 0;
	  for (int i = 1; i < inputArray.length; i++) {
	    if (inputArray[i] < inputArray[indexOfMinimum]) {
	      indexOfMinimum = i;
	    }
	  }
	  return inputArray[indexOfMinimum] ;
	}
	
	public static void main(String[] args) {
		int[] arr = {0, -2, 5, 6, -9};
		arrayMinimum(arr);
	}
}