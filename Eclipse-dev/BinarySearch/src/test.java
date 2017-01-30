import java.util.Arrays;

public class test {

  public static void main(String[] args)  {

      // binary search
      int numberToSearch = 9;
      int[] array = {1,5,7,9,5,3,1,2,4,5,66,44,778,9,75};
      Arrays.sort(array);

      int start = 0;
      int end = array.length - 1;

      while (start < end) {
        int middle = (start + end) / 2;
        if (numberToSearch > array[middle]) {
          start = middle + 1;
        }
        else {
          end = middle;
        }
      }

      if (array[start] == numberToSearch) {
        System.out.println("Number found");
    }
    else {
    	System.out.println("Number not found");
    }
  }
}
