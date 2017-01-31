
public class ArrayMin {

	public static void main(String[] args) {
		int[] arr = {19, 32, 11, 23};
		System.out.println(arrayMinimum(arr));

	}
	
	
	public static int arrayMinimum(int[] inputArray) {

		  int indexOfMinimum = inputArray[0];
		  
		  for (int i = 1; i < inputArray.length; i++) {
		    if (inputArray[i] < indexOfMinimum) {
		      indexOfMinimum = inputArray[i];
		    }
		  }
		  return indexOfMinimum ;
		}


}
