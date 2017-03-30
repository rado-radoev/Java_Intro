import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {

	InsertionSort insertionSort;
	
	@Before
	public void setUp() throws Exception {
		insertionSort = new InsertionSort();
	}

	@Test
	public void test1() {
		int[] arr = {9,2,6,7,8,1,3,4,5,0};
		int[] arrSorted = {0,1,2,3,4,5,6,7,8,9};
		assertArrayEquals(arrSorted, insertionSort.sort(arr));
	}
	
	
	@Test
	public void test2() {
		int[] arr = {20, 50, 80, 100,999,2,896,331,5,0};
		int[] arrSorted = {0,2,5,20,50,80,100,331,896,999};
		assertTrue(Arrays.equals(arrSorted, insertionSort.sort(arr)));
	}

}
