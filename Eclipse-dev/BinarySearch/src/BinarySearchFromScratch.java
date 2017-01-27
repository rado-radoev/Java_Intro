import java.util.Arrays;

public class BinarySearchFromScratch {

    public static void main(String[] args) {

    	// Create new array
        int[] numbers = {1,5,20,89,100,47,12,96,34,25,84,23,57,98};
        
        // Sort the array
        Arrays.sort(numbers);

        /**
         * num = number we are looking for
         * start = start of the array
         * end = length of the array
         */
        int num = 57;
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
        	// middle of the array - recalculated with every iteration
            int middle = (start + end) / 2;
            if (num > numbers[middle]) {
            	// move the start index after the middle
                start = middle + 1;
            }
            else {
            	// if the number we are looking for is lower than the middle number
            	// change the end of the array to be the middle
                end = middle;
            }
        }

    	// if the number exists the num should be equal the start/end index
        // the middle index should be one index lower then start/end
        if (num == numbers[start]) {
          System.out.println("Number exists in the array - " + num );
          System.out.println("It is at position " + start);
        }
        else {
          System.out.println("Number does not exist in the array.");
        }
    }
}
