
public class BinarySearch {
    public static void main(String[] args) {
      /**Binary search algorithm - search value x = 75*/
      int[] numbers = {15,23,26,41,52,59,75,84,91};
    
      int num = 75;
      int i = 1;
      int j = numbers.length;
      
      while (i < j) {
    	  int m = (i + j) / 2;
    	  
    	  if (num > numbers[m]) {
    		  i = m + 1;
    	  }
    	  else {
    		  j = m;
    	  }
      }
      
      if (num == numbers[i]) {
    	  System.out.println(num);
      }
      else {
    	  System.out.println("fuck");
      }
    }
}
