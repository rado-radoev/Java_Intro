import org.junit.Test;
import static org.junit.Assert.*;


public class TestShoes {

	// Instantiating empty shoe object to be used for testing
	Shoe shoe;
	
	// test by creating new DressShoe
	@Test
	public void TestDressShoe() {
		shoe = new DressShoe(9, "Blue");
		assertEquals(9, shoe.getSize());
		assertEquals("Blue", shoe.getColor());
	}
	
	// test by creating new RunningShoe
	@Test
	public void TestRunningShoe() {
		shoe = new RunningShoe(10, "Orange");
		assertEquals(10, shoe.getSize());
		assertEquals("Orange", shoe.getColor());
	}
	
	// test by creating new WorkingBoot
	@Test
	public void TestWorkingBoot() {
		shoe = new RunningShoe(7, "Yellow");
		assertEquals(7, shoe.getSize());
		assertEquals("Yellow", shoe.getColor());
	}

}
