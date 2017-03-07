import static org.junit.Assert.*;
import org.junit.Test;


public class MiddleExampleTests {

	@Test
	public void eventTests() {
		assertEquals("es", GetMiddle.getMiddle("test"));
		assertEquals("dd", GetMiddle.getMiddle("middle"));
	}
	
	@Test
	public void oddTests() {
		assertEquals("t", GetMiddle.getMiddle("testing"));
		assertEquals("A", GetMiddle.getMiddle("A"));
	}

}
