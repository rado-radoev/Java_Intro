package lambdaexpressions;
import java.util.Arrays;

public class test {

  public static void main(String[] args)  {

      // binary search
      int numberToSearch = 6;
      int[] array = {1,5,7,9,5,3,1,2,4,5,66,44,778,9,75};
      Arrays.sort(array);

      int start = 0;
      int end = array.length - 1;

      while (start <= end) {
        int middle = (start + end) / 2;
//        if (array[middle] == numberToSearch) {
//        System.out.printf("Number found at index %s%n", middle);
//          break;
//        }
        if (array[middle] < numberToSearch) {
          start = middle + 1;
        }
        else {
          end = middle;
        }
      }

      if (start == numberToSearch) {
        System.out.println("Number found");
    }
  }
}
