import static org.junit.Assert.*;

import org.junit.Test;

public class TestShoes {

	Shoe shoe;
	
	@Test
	public void testDressShoe() {
		shoe = new DressShoe(9, "Black");
		assertNotNull(shoe.color);
		assertTrue(shoe.size > 0);
	}

	
	@Test 
	public void testRunningShoe() {
		shoe = new RunningShoe(9, "orange");
		assertEquals(shoe.color, "orange1");
		assertTrue(shoe.size == 91);
	}

}
